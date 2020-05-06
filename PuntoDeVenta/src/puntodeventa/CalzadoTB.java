/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

public class CalzadoTB {
    
    private int codigo;
    private String categoria;
    private String marca;
    private String modelo;
    private String color;
    private int numero;
    private int precio;
    private String fechaRegInv;
    
    
    public CalzadoTB(int codigo,String categoria, String marca, String modelo, String color, int numero, int precio, String fechaRegInv) {
        this.codigo=codigo;
        this.categoria=categoria;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.numero=numero;
        this.precio=precio;
        this.fechaRegInv=fechaRegInv;
    }

    public CalzadoTB() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFechaRegInv() {
        return fechaRegInv;
    }

    public void setFechaRegInv(String fechaRegInv) {
        this.fechaRegInv = fechaRegInv;
    }
    
    
    
}
