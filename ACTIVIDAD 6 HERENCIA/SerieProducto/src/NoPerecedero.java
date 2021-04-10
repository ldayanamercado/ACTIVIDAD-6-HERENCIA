/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class NoPerecedero extends Producto{
    private String tipo;
   

    public NoPerecedero() {
        super();
    }

    public NoPerecedero(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double calcular(int cantidad){
    
        return super.calcular(cantidad);
    
    }

    
    @Override
    public String toString() {
        return "NoPerecedero{"+super.toString() + "tipo=" + tipo + '}';
    }



    
    
    
    
            
    
}
