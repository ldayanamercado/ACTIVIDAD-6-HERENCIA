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
       
        Perecedero p1 = new Perecedero(11, 04, 2021, "Yogur", 1000);
        System.out.println(p1);
        System.out.println(p1.calcular(1));
        
        Perecedero p2 = new Perecedero(10, 04, 2021, "Leche", 2000);
        System.out.println(p2);
        System.out.println(p2.calcular(1));
        Perecedero p3 = new Perecedero(12, 04, 2021, "Yogur de klaren", 1200);
        System.out.println(p3);
        System.out.println(p3.calcular(1));
        Perecedero p4 = new Perecedero(22, 04, 2021, "salchicha", 500);
        System.out.println(p4);
        System.out.println(p4.calcular(1));
        Perecedero p5 = new Perecedero(2, 05, 2021, "Yogur", 1000);
        System.out.println(p5);
        System.out.println(p5.calcular(1));
        
        NoPerecedero np1= new NoPerecedero("comida", "Arrroz", 2000);
        System.out.println(np1);
        System.out.println(np1.calcular(1));
        NoPerecedero np2 = new NoPerecedero("aseo", "Escoba", 1500);
        System.out.println(np2);
        System.out.println(np2.calcular(1));
        NoPerecedero np3 = new NoPerecedero("aseo personal", "jabon", 500);
        System.out.println(np3);
        System.out.println(np3.calcular(1));
        NoPerecedero np4 = new NoPerecedero("comida", "Queso", 1000);
        System.out.println(np4);
        System.out.println(np4.calcular(1));
        NoPerecedero np5 = new NoPerecedero("aseo", "trapero", 2500);
        System.out.println(np5);
        System.out.println(np5.calcular(1));
        

        
    }
    
}
