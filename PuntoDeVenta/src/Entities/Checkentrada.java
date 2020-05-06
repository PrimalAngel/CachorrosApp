/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "checkentrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Checkentrada.findAll", query = "SELECT c FROM Checkentrada c"),
    @NamedQuery(name = "Checkentrada.findByIdcheck", query = "SELECT c FROM Checkentrada c WHERE c.idcheck = :idcheck"),
    @NamedQuery(name = "Checkentrada.findByHora", query = "SELECT c FROM Checkentrada c WHERE c.hora = :hora"),
    @NamedQuery(name = "Checkentrada.findByFecha", query = "SELECT c FROM Checkentrada c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Checkentrada.findByRetardos", query = "SELECT c FROM Checkentrada c WHERE c.retardos = :retardos")})
public class Checkentrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcheck")
    private Integer idcheck;
    @Basic(optional = false)
    @Column(name = "hora")
    private String hora;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "retardos")
    private Integer retardos;
    @JoinColumn(name = "idTrabajador", referencedColumnName = "idTrabajador")
    @ManyToOne(optional = false)
    private Trabajador idTrabajador;

    public Checkentrada() {
    }

    public Checkentrada(Integer idcheck) {
        this.idcheck = idcheck;
    }

    public Checkentrada(Integer idcheck, String hora, String fecha) {
        this.idcheck = idcheck;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Integer getIdcheck() {
        return idcheck;
    }

    public void setIdcheck(Integer idcheck) {
        this.idcheck = idcheck;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getRetardos() {
        return retardos;
    }

    public void setRetardos(Integer retardos) {
        this.retardos = retardos;
    }

    public Trabajador getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Trabajador idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcheck != null ? idcheck.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Checkentrada)) {
            return false;
        }
        Checkentrada other = (Checkentrada) object;
        if ((this.idcheck == null && other.idcheck != null) || (this.idcheck != null && !this.idcheck.equals(other.idcheck))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Checkentrada[ idcheck=" + idcheck + " ]";
    }
    
}
