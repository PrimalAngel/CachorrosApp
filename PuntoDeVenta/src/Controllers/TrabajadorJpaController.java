/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.exceptions.IllegalOrphanException;
import Controllers.exceptions.NonexistentEntityException;
import Controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entities.Checkentrada;
import java.util.ArrayList;
import java.util.Collection;
import Entities.Checksalida;
import Entities.Trabajador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO
 */
public class TrabajadorJpaController implements Serializable {

    public TrabajadorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Trabajador trabajador) throws PreexistingEntityException, Exception {
        if (trabajador.getCheckentradaCollection() == null) {
            trabajador.setCheckentradaCollection(new ArrayList<Checkentrada>());
        }
        if (trabajador.getChecksalidaCollection() == null) {
            trabajador.setChecksalidaCollection(new ArrayList<Checksalida>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Checkentrada> attachedCheckentradaCollection = new ArrayList<Checkentrada>();
            for (Checkentrada checkentradaCollectionCheckentradaToAttach : trabajador.getCheckentradaCollection()) {
                checkentradaCollectionCheckentradaToAttach = em.getReference(checkentradaCollectionCheckentradaToAttach.getClass(), checkentradaCollectionCheckentradaToAttach.getIdcheck());
                attachedCheckentradaCollection.add(checkentradaCollectionCheckentradaToAttach);
            }
            trabajador.setCheckentradaCollection(attachedCheckentradaCollection);
            Collection<Checksalida> attachedChecksalidaCollection = new ArrayList<Checksalida>();
            for (Checksalida checksalidaCollectionChecksalidaToAttach : trabajador.getChecksalidaCollection()) {
                checksalidaCollectionChecksalidaToAttach = em.getReference(checksalidaCollectionChecksalidaToAttach.getClass(), checksalidaCollectionChecksalidaToAttach.getIdchecksalida());
                attachedChecksalidaCollection.add(checksalidaCollectionChecksalidaToAttach);
            }
            trabajador.setChecksalidaCollection(attachedChecksalidaCollection);
            em.persist(trabajador);
            for (Checkentrada checkentradaCollectionCheckentrada : trabajador.getCheckentradaCollection()) {
                Trabajador oldIdTrabajadorOfCheckentradaCollectionCheckentrada = checkentradaCollectionCheckentrada.getIdTrabajador();
                checkentradaCollectionCheckentrada.setIdTrabajador(trabajador);
                checkentradaCollectionCheckentrada = em.merge(checkentradaCollectionCheckentrada);
                if (oldIdTrabajadorOfCheckentradaCollectionCheckentrada != null) {
                    oldIdTrabajadorOfCheckentradaCollectionCheckentrada.getCheckentradaCollection().remove(checkentradaCollectionCheckentrada);
                    oldIdTrabajadorOfCheckentradaCollectionCheckentrada = em.merge(oldIdTrabajadorOfCheckentradaCollectionCheckentrada);
                }
            }
            for (Checksalida checksalidaCollectionChecksalida : trabajador.getChecksalidaCollection()) {
                Trabajador oldIdTrabajadorOfChecksalidaCollectionChecksalida = checksalidaCollectionChecksalida.getIdTrabajador();
                checksalidaCollectionChecksalida.setIdTrabajador(trabajador);
                checksalidaCollectionChecksalida = em.merge(checksalidaCollectionChecksalida);
                if (oldIdTrabajadorOfChecksalidaCollectionChecksalida != null) {
                    oldIdTrabajadorOfChecksalidaCollectionChecksalida.getChecksalidaCollection().remove(checksalidaCollectionChecksalida);
                    oldIdTrabajadorOfChecksalidaCollectionChecksalida = em.merge(oldIdTrabajadorOfChecksalidaCollectionChecksalida);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTrabajador(trabajador.getIdTrabajador()) != null) {
                throw new PreexistingEntityException("Trabajador " + trabajador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Trabajador trabajador) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trabajador persistentTrabajador = em.find(Trabajador.class, trabajador.getIdTrabajador());
            Collection<Checkentrada> checkentradaCollectionOld = persistentTrabajador.getCheckentradaCollection();
            Collection<Checkentrada> checkentradaCollectionNew = trabajador.getCheckentradaCollection();
            Collection<Checksalida> checksalidaCollectionOld = persistentTrabajador.getChecksalidaCollection();
            Collection<Checksalida> checksalidaCollectionNew = trabajador.getChecksalidaCollection();
            List<String> illegalOrphanMessages = null;
            for (Checkentrada checkentradaCollectionOldCheckentrada : checkentradaCollectionOld) {
                if (!checkentradaCollectionNew.contains(checkentradaCollectionOldCheckentrada)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Checkentrada " + checkentradaCollectionOldCheckentrada + " since its idTrabajador field is not nullable.");
                }
            }
            for (Checksalida checksalidaCollectionOldChecksalida : checksalidaCollectionOld) {
                if (!checksalidaCollectionNew.contains(checksalidaCollectionOldChecksalida)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Checksalida " + checksalidaCollectionOldChecksalida + " since its idTrabajador field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Checkentrada> attachedCheckentradaCollectionNew = new ArrayList<Checkentrada>();
            for (Checkentrada checkentradaCollectionNewCheckentradaToAttach : checkentradaCollectionNew) {
                checkentradaCollectionNewCheckentradaToAttach = em.getReference(checkentradaCollectionNewCheckentradaToAttach.getClass(), checkentradaCollectionNewCheckentradaToAttach.getIdcheck());
                attachedCheckentradaCollectionNew.add(checkentradaCollectionNewCheckentradaToAttach);
            }
            checkentradaCollectionNew = attachedCheckentradaCollectionNew;
            trabajador.setCheckentradaCollection(checkentradaCollectionNew);
            Collection<Checksalida> attachedChecksalidaCollectionNew = new ArrayList<Checksalida>();
            for (Checksalida checksalidaCollectionNewChecksalidaToAttach : checksalidaCollectionNew) {
                checksalidaCollectionNewChecksalidaToAttach = em.getReference(checksalidaCollectionNewChecksalidaToAttach.getClass(), checksalidaCollectionNewChecksalidaToAttach.getIdchecksalida());
                attachedChecksalidaCollectionNew.add(checksalidaCollectionNewChecksalidaToAttach);
            }
            checksalidaCollectionNew = attachedChecksalidaCollectionNew;
            trabajador.setChecksalidaCollection(checksalidaCollectionNew);
            trabajador = em.merge(trabajador);
            for (Checkentrada checkentradaCollectionNewCheckentrada : checkentradaCollectionNew) {
                if (!checkentradaCollectionOld.contains(checkentradaCollectionNewCheckentrada)) {
                    Trabajador oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada = checkentradaCollectionNewCheckentrada.getIdTrabajador();
                    checkentradaCollectionNewCheckentrada.setIdTrabajador(trabajador);
                    checkentradaCollectionNewCheckentrada = em.merge(checkentradaCollectionNewCheckentrada);
                    if (oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada != null && !oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada.equals(trabajador)) {
                        oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada.getCheckentradaCollection().remove(checkentradaCollectionNewCheckentrada);
                        oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada = em.merge(oldIdTrabajadorOfCheckentradaCollectionNewCheckentrada);
                    }
                }
            }
            for (Checksalida checksalidaCollectionNewChecksalida : checksalidaCollectionNew) {
                if (!checksalidaCollectionOld.contains(checksalidaCollectionNewChecksalida)) {
                    Trabajador oldIdTrabajadorOfChecksalidaCollectionNewChecksalida = checksalidaCollectionNewChecksalida.getIdTrabajador();
                    checksalidaCollectionNewChecksalida.setIdTrabajador(trabajador);
                    checksalidaCollectionNewChecksalida = em.merge(checksalidaCollectionNewChecksalida);
                    if (oldIdTrabajadorOfChecksalidaCollectionNewChecksalida != null && !oldIdTrabajadorOfChecksalidaCollectionNewChecksalida.equals(trabajador)) {
                        oldIdTrabajadorOfChecksalidaCollectionNewChecksalida.getChecksalidaCollection().remove(checksalidaCollectionNewChecksalida);
                        oldIdTrabajadorOfChecksalidaCollectionNewChecksalida = em.merge(oldIdTrabajadorOfChecksalidaCollectionNewChecksalida);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = trabajador.getIdTrabajador();
                if (findTrabajador(id) == null) {
                    throw new NonexistentEntityException("The trabajador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trabajador trabajador;
            try {
                trabajador = em.getReference(Trabajador.class, id);
                trabajador.getIdTrabajador();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The trabajador with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Checkentrada> checkentradaCollectionOrphanCheck = trabajador.getCheckentradaCollection();
            for (Checkentrada checkentradaCollectionOrphanCheckCheckentrada : checkentradaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Trabajador (" + trabajador + ") cannot be destroyed since the Checkentrada " + checkentradaCollectionOrphanCheckCheckentrada + " in its checkentradaCollection field has a non-nullable idTrabajador field.");
            }
            Collection<Checksalida> checksalidaCollectionOrphanCheck = trabajador.getChecksalidaCollection();
            for (Checksalida checksalidaCollectionOrphanCheckChecksalida : checksalidaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Trabajador (" + trabajador + ") cannot be destroyed since the Checksalida " + checksalidaCollectionOrphanCheckChecksalida + " in its checksalidaCollection field has a non-nullable idTrabajador field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(trabajador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Trabajador> findTrabajadorEntities() {
        return findTrabajadorEntities(true, -1, -1);
    }

    public List<Trabajador> findTrabajadorEntities(int maxResults, int firstResult) {
        return findTrabajadorEntities(false, maxResults, firstResult);
    }

    private List<Trabajador> findTrabajadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Trabajador.class));
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

    public Trabajador findTrabajador(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Trabajador.class, id);
        } finally {
            em.close();
        }
    }

    public int getTrabajadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Trabajador> rt = cq.from(Trabajador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
