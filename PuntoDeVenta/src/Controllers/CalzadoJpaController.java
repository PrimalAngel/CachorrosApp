/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.exceptions.IllegalOrphanException;
import Controllers.exceptions.NonexistentEntityException;
import Entities.Calzado;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entities.Venta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO
 */
public class CalzadoJpaController implements Serializable {

    public CalzadoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Calzado calzado) {
        if (calzado.getVentaCollection() == null) {
            calzado.setVentaCollection(new ArrayList<Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Venta> attachedVentaCollection = new ArrayList<Venta>();
            for (Venta ventaCollectionVentaToAttach : calzado.getVentaCollection()) {
                ventaCollectionVentaToAttach = em.getReference(ventaCollectionVentaToAttach.getClass(), ventaCollectionVentaToAttach.getIdventa());
                attachedVentaCollection.add(ventaCollectionVentaToAttach);
            }
            calzado.setVentaCollection(attachedVentaCollection);
            em.persist(calzado);
            for (Venta ventaCollectionVenta : calzado.getVentaCollection()) {
                Calzado oldCodigoOfVentaCollectionVenta = ventaCollectionVenta.getCodigo();
                ventaCollectionVenta.setCodigo(calzado);
                ventaCollectionVenta = em.merge(ventaCollectionVenta);
                if (oldCodigoOfVentaCollectionVenta != null) {
                    oldCodigoOfVentaCollectionVenta.getVentaCollection().remove(ventaCollectionVenta);
                    oldCodigoOfVentaCollectionVenta = em.merge(oldCodigoOfVentaCollectionVenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Calzado calzado) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Calzado persistentCalzado = em.find(Calzado.class, calzado.getCodigo());
            Collection<Venta> ventaCollectionOld = persistentCalzado.getVentaCollection();
            Collection<Venta> ventaCollectionNew = calzado.getVentaCollection();
            List<String> illegalOrphanMessages = null;
            for (Venta ventaCollectionOldVenta : ventaCollectionOld) {
                if (!ventaCollectionNew.contains(ventaCollectionOldVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Venta " + ventaCollectionOldVenta + " since its codigo field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Venta> attachedVentaCollectionNew = new ArrayList<Venta>();
            for (Venta ventaCollectionNewVentaToAttach : ventaCollectionNew) {
                ventaCollectionNewVentaToAttach = em.getReference(ventaCollectionNewVentaToAttach.getClass(), ventaCollectionNewVentaToAttach.getIdventa());
                attachedVentaCollectionNew.add(ventaCollectionNewVentaToAttach);
            }
            ventaCollectionNew = attachedVentaCollectionNew;
            calzado.setVentaCollection(ventaCollectionNew);
            calzado = em.merge(calzado);
            for (Venta ventaCollectionNewVenta : ventaCollectionNew) {
                if (!ventaCollectionOld.contains(ventaCollectionNewVenta)) {
                    Calzado oldCodigoOfVentaCollectionNewVenta = ventaCollectionNewVenta.getCodigo();
                    ventaCollectionNewVenta.setCodigo(calzado);
                    ventaCollectionNewVenta = em.merge(ventaCollectionNewVenta);
                    if (oldCodigoOfVentaCollectionNewVenta != null && !oldCodigoOfVentaCollectionNewVenta.equals(calzado)) {
                        oldCodigoOfVentaCollectionNewVenta.getVentaCollection().remove(ventaCollectionNewVenta);
                        oldCodigoOfVentaCollectionNewVenta = em.merge(oldCodigoOfVentaCollectionNewVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = calzado.getCodigo();
                if (findCalzado(id) == null) {
                    throw new NonexistentEntityException("The calzado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Calzado calzado;
            try {
                calzado = em.getReference(Calzado.class, id);
                calzado.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The calzado with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Venta> ventaCollectionOrphanCheck = calzado.getVentaCollection();
            for (Venta ventaCollectionOrphanCheckVenta : ventaCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Calzado (" + calzado + ") cannot be destroyed since the Venta " + ventaCollectionOrphanCheckVenta + " in its ventaCollection field has a non-nullable codigo field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(calzado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Calzado> findCalzadoEntities() {
        return findCalzadoEntities(true, -1, -1);
    }

    public List<Calzado> findCalzadoEntities(int maxResults, int firstResult) {
        return findCalzadoEntities(false, maxResults, firstResult);
    }

    private List<Calzado> findCalzadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Calzado.class));
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

    public Calzado findCalzado(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Calzado.class, id);
        } finally {
            em.close();
        }
    }

    public int getCalzadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Calzado> rt = cq.from(Calzado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public void updateStatus(int codigo){
        EntityManager em = null;
        
        
        int cod=codigo;
        String vend="Vendido";
        try{
            em= getEntityManager();
            //em.createNamedQuery("Calzado.updateStatus").setParameter("codigo", cod).setParameter("Vendido", vend);
            Query query = em.createNamedQuery("Calzado.updateStatus");
            int updateCount = query.setParameter("codigo", cod).executeUpdate();
            System.out.println("Actualizado");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        /*Query query = em.createQuery(
                "UPDATE Calzado SET Status='Vendido' where codigo=''");
        int updateCount = query.executeUpdate();*/
    }
    
    public List findByNombreLike(String modelo) {

        EntityManager em = null;
        try {
// itemsSearch = null;
            
            String nombre = modelo;
            if (nombre == null) {

                return null;
            }
            em = getEntityManager();

// aqui convertimos a minuscula y buscamos la palabra en cualquier
            nombre = "%" + nombre.trim() + "%";
            return em.createNamedQuery("Calzado.findByNombreLike").setParameter("modelo", nombre).getResultList();

        } catch (Exception ex) {
            System.out.println(ex + "No se encontro ningun resultado");
        }
        return null;
    }
    
}
