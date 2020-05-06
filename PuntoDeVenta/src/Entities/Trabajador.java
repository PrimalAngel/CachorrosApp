/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "trabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajador.findAll", query = "SELECT t FROM Trabajador t"),
    @NamedQuery(name = "Trabajador.findByIdTrabajador", query = "SELECT t FROM Trabajador t WHERE t.idTrabajador = :idTrabajador"),
    @NamedQuery(name = "Trabajador.findByNomCompleto", query = "SELECT t FROM Trabajador t WHERE t.nomCompleto = :nomCompleto"),
    @NamedQuery(name = "Trabajador.findByCargo", query = "SELECT t FROM Trabajador t WHERE t.cargo = :cargo"),
    @NamedQuery(name = "Trabajador.findByDireccion", query = "SELECT t FROM Trabajador t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Trabajador.findByEdad", query = "SELECT t FROM Trabajador t WHERE t.edad = :edad")})
public class Trabajador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTrabajador")
    private String idTrabajador;
    @Basic(optional = false)
    @Column(name = "nomCompleto")
    private String nomCompleto;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrabajador")
    private Collection<Checkentrada> checkentradaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrabajador")
    private Collection<Checksalida> checksalidaCollection;

    public Trabajador() {
    }

    public Trabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Trabajador(String idTrabajador, String nomCompleto, String cargo, String direccion, int edad) {
        this.idTrabajador = idTrabajador;
        this.nomCompleto = nomCompleto;
        this.cargo = cargo;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlTransient
    public Collection<Checkentrada> getCheckentradaCollection() {
        return checkentradaCollection;
    }

    public void setCheckentradaCollection(Collection<Checkentrada> checkentradaCollection) {
        this.checkentradaCollection = checkentradaCollection;
    }

    @XmlTransient
    public Collection<Checksalida> getChecksalidaCollection() {
        return checksalidaCollection;
    }

    public void setChecksalidaCollection(Collection<Checksalida> checksalidaCollection) {
        this.checksalidaCollection = checksalidaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajador != null ? idTrabajador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.idTrabajador == null && other.idTrabajador != null) || (this.idTrabajador != null && !this.idTrabajador.equals(other.idTrabajador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Trabajador[ idTrabajador=" + idTrabajador + " ]";
    }
    
}
