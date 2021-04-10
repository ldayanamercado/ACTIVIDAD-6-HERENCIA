
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class ProfesorInterino extends Profesor{
    private LocalDate fecha;

    public ProfesorInterino() {
        super();
    }


    public ProfesorInterino(LocalDate fecha, String idProfesor, String nombre, String apellido) {
        super(idProfesor, nombre, apellido);
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()+" ProfesorInterino{ fecha de incorporacion :" + fecha + '}';
    }
    
    
    
    
    
    
}
