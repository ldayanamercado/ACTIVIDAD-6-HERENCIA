/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Empleado  E1 = new Empleado("Rafa");
        System.out.println(E1);
        Directivo  D1 = new Directivo("Mario");
        System.out.println(D1);
        Operario  O1 = new Operario("Alfonso");
        System.out.println(O1);
        Oficial  OF1 = new Oficial("Luis");
        System.out.println(OF1);
        Tecnico  T1 = new Tecnico("Pablo");
        System.out.println(T1);
    }
    
}
