
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
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Luis Jose", "Prado Cortes");
        System.out.println(p1);
        Profesor Pr1 = new Profesor("profe-123-453", "Sara ", "Gonzalez");
        System.out.println(Pr1);
        ProfesorInterino PI1 = new ProfesorInterino(LocalDate.now(), "profe-34-56-3", "juan", "Martinez");
        System.out.println(PI1);
        
    }
    
}
