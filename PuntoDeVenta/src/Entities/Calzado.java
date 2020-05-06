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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "calzado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calzado.findAll", query = "SELECT c FROM Calzado c"),
    @NamedQuery(name = "Calzado.findByCodigo", query = "SELECT c FROM Calzado c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Calzado.findByCategoria", query = "SELECT c FROM Calzado c WHERE c.categoria = :categoria"),
    @NamedQuery(name = "Calzado.findByMarca", query = "SELECT c FROM Calzado c WHERE c.marca = :marca"),
    @NamedQuery(name = "Calzado.findByModelo", query = "SELECT c FROM Calzado c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Calzado.findByColor", query = "SELECT c FROM Calzado c WHERE c.color = :color"),
    @NamedQuery(name = "Calzado.findByNumero", query = "SELECT c FROM Calzado c WHERE c.numero = :numero"),
    @NamedQuery(name = "Calzado.findByPrecio", query = "SELECT c FROM Calzado c WHERE c.precio = :precio"),
    @NamedQuery(name = "Calzado.findByFechaRegInv", query = "SELECT c FROM Calzado c WHERE c.fechaRegInv = :fechaRegInv"),
    @NamedQuery(name = "Calzado.findByStatus", query = "SELECT c FROM Calzado c WHERE c.status = :status"),
    @NamedQuery(name = "Calzado.findByNombreLike", query = "SELECT c FROM Calzado c WHERE lower(c.modelo) like :modelo AND c.status<>'Vendido'"),
    @NamedQuery(name = "Calzado.updateStatus", query = "UPDATE Calzado SET status = 'Vendido' WHERE codigo= :codigo"),
    @NamedQuery(name = "Calzado.findByStatus", query = "SELECT c FROM Calzado c WHERE c.status = :status")})
public class Calzado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "numero")
    private float numero;
    @Basic(optional = false)
    @Column(name = "precio")
    private float precio;
    @Basic(optional = false)
    @Column(name = "fechaRegInv")
    private String fechaRegInv;
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigo")
    private Collection<Venta> ventaCollection;

    public Calzado() {
    }

    public Calzado(Integer codigo) {
        this.codigo = codigo;
    }

    public Calzado(Integer codigo, String categoria, String marca, String modelo, String color, float numero, float precio, String fechaRegInv) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numero = numero;
        this.precio = precio;
        this.fechaRegInv = fechaRegInv;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaRegInv() {
        return fechaRegInv;
    }

    public void setFechaRegInv(String fechaRegInv) {
        this.fechaRegInv = fechaRegInv;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calzado)) {
            return false;
        }
        Calzado other = (Calzado) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Calzado[ codigo=" + codigo + " ]";
    }
    
}
