/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaiva;

import java.util.Scanner;

/**
 *
 * @author Ingenieros
 */
public class PruebaIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Double base = null;
        Double porcentaje = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer producto: ");
        double producto1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo producto: ");
        double producto2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del porcentaje para calcular: ");
        porcentaje = entrada.nextDouble();
        System.out.println("El valor de IVA Calculado con los dos productos es:"+base);
        System.out.println(calcular_1(base, porcentaje));

    }
    
   

    private static double calcular_1(double base, java.lang.Double porcentaje) {
        ws.suma.productos.Calulador_Service service = new ws.suma.productos.Calulador_Service();
        ws.suma.productos.Calulador port = service.getCaluladorPort();
        return port.calcular(base, porcentaje);
    }

    private static String perdirDatos(double producto1, double producto2) {
        ws.suma.productos.Calulador_Service service = new ws.suma.productos.Calulador_Service();
        ws.suma.productos.Calulador port = service.getCaluladorPort();
        return port.perdirDatos(producto1, producto2);
    }

    
    
}
