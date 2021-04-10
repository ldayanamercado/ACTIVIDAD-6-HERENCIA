/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Portatil extends Ordenador{
    private float peso;

    public Portatil() {
        super ();
    }

    

    public Portatil(float peso, String codigo, double precio) {
        super(codigo, "ideal para sus viajes ", precio);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Portatil: " +super.toString()+ "peso= " + peso + '}';
    }
    
    
    
}
