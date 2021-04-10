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
        
        Portatil portatil = new Portatil(2, "pc-23-4", 200030);
        System.out.println(portatil);
        SobreMesa sobremesa = new SobreMesa("incluye todos los puertos", "SM-345-2", 123420);
        System.out.println(sobremesa);
    }
    
}
