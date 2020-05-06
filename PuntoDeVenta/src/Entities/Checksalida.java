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
@Table(name = "checksalida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Checksalida.findAll", query = "SELECT c FROM Checksalida c"),
    @NamedQuery(name = "Checksalida.findByIdchecksalida", query = "SELECT c FROM Checksalida c WHERE c.idchecksalida = :idchecksalida"),
    @NamedQuery(name = "Checksalida.findByHora", query = "SELECT c FROM Checksalida c WHERE c.hora = :hora"),
    @NamedQuery(name = "Checksalida.findByFecha", query = "SELECT c FROM Checksalida c WHERE c.fecha = :fecha")})
public class Checksalida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idchecksalida")
    private Integer idchecksalida;
    @Column(name = "hora")
    private String hora;
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "idTrabajador", referencedColumnName = "idTrabajador")
    @ManyToOne(optional = false)
    private Trabajador idTrabajador;

    public Checksalida() {
    }

    public Checksalida(Integer idchecksalida) {
        this.idchecksalida = idchecksalida;
    }

    public Integer getIdchecksalida() {
        return idchecksalida;
    }

    public void setIdchecksalida(Integer idchecksalida) {
        this.idchecksalida = idchecksalida;
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

    public Trabajador getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Trabajador idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idchecksalida != null ? idchecksalida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Checksalida)) {
            return false;
        }
        Checksalida other = (Checksalida) object;
        if ((this.idchecksalida == null && other.idchecksalida != null) || (this.idchecksalida != null && !this.idchecksalida.equals(other.idchecksalida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Checksalida[ idchecksalida=" + idchecksalida + " ]";
    }
    
}
