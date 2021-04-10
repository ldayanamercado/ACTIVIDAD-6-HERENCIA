/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class SobreMesa extends Ordenador{
    private String descripcion;

    public SobreMesa() {
    }



    public SobreMesa(String descripcion, String codigo, double precio) {
        super(codigo, "Es el quee mas pesa, pero menos cuesta ", precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return " Equipo Sobre Mesa{"+super.toString() + "descripcion= " + descripcion + '}';
    }
    
    
    
    
    
}
