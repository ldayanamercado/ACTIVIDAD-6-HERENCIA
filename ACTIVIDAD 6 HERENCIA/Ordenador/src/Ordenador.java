/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Ordenador {
    private String codigo,slogan;
    private double precio;

    public Ordenador() {
    }

    public Ordenador(String codigo, String slogan, double precio) {
        this.codigo = codigo;
        this.slogan = slogan;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        
        
        return   "codigo= " + codigo + ", Slogan= " + slogan + ", Precio= " + precio +" ";
    }
    
    
    
   
    
}
