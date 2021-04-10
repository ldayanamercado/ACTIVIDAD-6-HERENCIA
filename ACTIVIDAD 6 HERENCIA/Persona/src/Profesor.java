/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Profesor extends Persona{
    private String idProfesor;

    public Profesor() {
        super();
    }


    public Profesor(String idProfesor, String nombre, String apellido) {
        super(nombre, apellido);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return  "Profesor"+super.toString()+idProfesor ;
    }
    
    
    

 
    
    
}
