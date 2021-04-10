
import java.time.LocalDate;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laura
 */
public class Perecedero extends Producto {
    
    private int dia, mes, anio;
    
    public Perecedero() {
        super();
    }
    
    
    public Perecedero(int dia, int mes, int anio, String nombre, double precio) {
        super(nombre, precio);
     
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public static int diaF (int dia, int mes, int anio) {        
        
        Calendar caducado = Calendar.getInstance();
        caducado.set(anio, mes - 1, dia);
        
        caducado.set(Calendar.HOUR, 0);
        caducado.set(Calendar.HOUR_OF_DAY, 0);
        caducado.set(Calendar.MINUTE, 0);
        caducado.set(Calendar.SECOND, 0);
        
        Calendar actual = Calendar.getInstance();
        
        actual.set(Calendar.HOUR, 0);
        actual.set(Calendar.HOUR_OF_DAY, 0);
        actual.set(Calendar.MINUTE, 0);
        actual.set(Calendar.SECOND, 0);
        
        long inicioMS = actual.getTimeInMillis();
        long finMS = caducado.getTimeInMillis();
        
        int dias = (int) ((Math.abs(inicioMS - finMS)) / (86400000));// milisenfundo segundos a minutos minutos a horas horas a dia
        
        return dias;
        
    }
    
    @Override
    public double calcular(int cantidad  ) {
        double preciot = 0;
        //  super.calcular(cantidad);
        //cantidad=5;
        if (diaF(dia, mes, anio) == 1) {
            System.out.println("queda 1 dia para caducar");
            preciot = super.calcular(cantidad) / 4;
            
        } else if (diaF(dia, mes, anio) == 2) {
            System.out.println("quedan 2 dias para caducar");

            preciot = super.calcular(cantidad) / 3;
        } else if (diaF(dia, mes, anio) == 3) {
            System.out.println("quedan 3 dias para caducar");
            preciot = super.calcular(cantidad) / 2;
        }else 
            preciot= super.calcular(cantidad);
            

        return preciot;


        
    }
    
    
    @Override
    public String toString() {
        return "Perecedero{" + super.toString() + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
}
