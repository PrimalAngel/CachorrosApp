/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.exceptions.NonexistentEntityException;
import Entities.Checksalida;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entities.Trabajador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO
 */
public class ChecksalidaJpaController implements Serializable {

    public ChecksalidaJpaController() {
       this.emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Checksalida checksalida) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trabajador idTrabajador = checksalida.getIdTrabajador();
            if (idTrabajador != null) {
                idTrabajador = em.getReference(idTrabajador.getClass(), idTrabajador.getIdTrabajador());
                checksalida.setIdTrabajador(idTrabajador);
            }
            em.persist(checksalida);
            if (idTrabajador != null) {
                idTrabajador.getChecksalidaCollection().add(checksalida);
                idTrabajador = em.merge(idTrabajador);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Checksalida checksalida) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Checksalida persistentChecksalida = em.find(Checksalida.class, checksalida.getIdchecksalida());
            Trabajador idTrabajadorOld = persistentChecksalida.getIdTrabajador();
            Trabajador idTrabajadorNew = checksalida.getIdTrabajador();
            if (idTrabajadorNew != null) {
                idTrabajadorNew = em.getReference(idTrabajadorNew.getClass(), idTrabajadorNew.getIdTrabajador());
                checksalida.setIdTrabajador(idTrabajadorNew);
            }
            checksalida = em.merge(checksalida);
            if (idTrabajadorOld != null && !idTrabajadorOld.equals(idTrabajadorNew)) {
                idTrabajadorOld.getChecksalidaCollection().remove(checksalida);
                idTrabajadorOld = em.merge(idTrabajadorOld);
            }
            if (idTrabajadorNew != null && !idTrabajadorNew.equals(idTrabajadorOld)) {
                idTrabajadorNew.getChecksalidaCollection().add(checksalida);
                idTrabajadorNew = em.merge(idTrabajadorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = checksalida.getIdchecksalida();
                if (findChecksalida(id) == null) {
                    throw new NonexistentEntityException("The checksalida with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Checksalida checksalida;
            try {
                checksalida = em.getReference(Checksalida.class, id);
                checksalida.getIdchecksalida();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The checksalida with id " + id + " no longer exists.", enfe);
            }
            Trabajador idTrabajador = checksalida.getIdTrabajador();
            if (idTrabajador != null) {
                idTrabajador.getChecksalidaCollection().remove(checksalida);
                idTrabajador = em.merge(idTrabajador);
            }
            em.remove(checksalida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Checksalida> findChecksalidaEntities() {
        return findChecksalidaEntities(true, -1, -1);
    }

    public List<Checksalida> findChecksalidaEntities(int maxResults, int firstResult) {
        return findChecksalidaEntities(false, maxResults, firstResult);
    }

    private List<Checksalida> findChecksalidaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Checksalida.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Checksalida findChecksalida(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Checksalida.class, id);
        } finally {
            em.close();
        }
    }

    public int getChecksalidaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Checksalida> rt = cq.from(Checksalida.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
