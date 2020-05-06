/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.exceptions.NonexistentEntityException;
import Entities.Checkentrada;
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
public class CheckentradaJpaController implements Serializable {

    public CheckentradaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Checkentrada checkentrada) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trabajador idTrabajador = checkentrada.getIdTrabajador();
            if (idTrabajador != null) {
                idTrabajador = em.getReference(idTrabajador.getClass(), idTrabajador.getIdTrabajador());
                checkentrada.setIdTrabajador(idTrabajador);
            }
            em.persist(checkentrada);
            if (idTrabajador != null) {
                idTrabajador.getCheckentradaCollection().add(checkentrada);
                idTrabajador = em.merge(idTrabajador);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Checkentrada checkentrada) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Checkentrada persistentCheckentrada = em.find(Checkentrada.class, checkentrada.getIdcheck());
            Trabajador idTrabajadorOld = persistentCheckentrada.getIdTrabajador();
            Trabajador idTrabajadorNew = checkentrada.getIdTrabajador();
            if (idTrabajadorNew != null) {
                idTrabajadorNew = em.getReference(idTrabajadorNew.getClass(), idTrabajadorNew.getIdTrabajador());
                checkentrada.setIdTrabajador(idTrabajadorNew);
            }
            checkentrada = em.merge(checkentrada);
            if (idTrabajadorOld != null && !idTrabajadorOld.equals(idTrabajadorNew)) {
                idTrabajadorOld.getCheckentradaCollection().remove(checkentrada);
                idTrabajadorOld = em.merge(idTrabajadorOld);
            }
            if (idTrabajadorNew != null && !idTrabajadorNew.equals(idTrabajadorOld)) {
                idTrabajadorNew.getCheckentradaCollection().add(checkentrada);
                idTrabajadorNew = em.merge(idTrabajadorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = checkentrada.getIdcheck();
                if (findCheckentrada(id) == null) {
                    throw new NonexistentEntityException("The checkentrada with id " + id + " no longer exists.");
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
            Checkentrada checkentrada;
            try {
                checkentrada = em.getReference(Checkentrada.class, id);
                checkentrada.getIdcheck();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The checkentrada with id " + id + " no longer exists.", enfe);
            }
            Trabajador idTrabajador = checkentrada.getIdTrabajador();
            if (idTrabajador != null) {
                idTrabajador.getCheckentradaCollection().remove(checkentrada);
                idTrabajador = em.merge(idTrabajador);
            }
            em.remove(checkentrada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Checkentrada> findCheckentradaEntities() {
        return findCheckentradaEntities(true, -1, -1);
    }

    public List<Checkentrada> findCheckentradaEntities(int maxResults, int firstResult) {
        return findCheckentradaEntities(false, maxResults, firstResult);
    }

    private List<Checkentrada> findCheckentradaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Checkentrada.class));
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

    public Checkentrada findCheckentrada(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Checkentrada.class, id);
        } finally {
            em.close();
        }
    }

    public int getCheckentradaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Checkentrada> rt = cq.from(Checkentrada.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public int BuscarRetardoEmpleado(String trabajador) {
        EntityManager em = null;
        try {
            String nombre = trabajador;
            em = getEntityManager();
            nombre = nombre.trim();
            //return ((Long) em.createNatiQuery("Entrada.BuscarRetardoEmpleado").setParameter("trabajador", nombre).getSingleResult()).intValue();
            return ((Long)em.createNativeQuery ("SELECT COUNT(retardos) FROM Entrada WHERE trabajador = '"+nombre+"' AND retardos = 1").getSingleResult()).intValue();
        } catch (Exception ex) {
            System.out.println("Error. Find Empleado" + ex);
        }
        return 0;
    }
    
}
