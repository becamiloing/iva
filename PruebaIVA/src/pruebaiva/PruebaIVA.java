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
   
        Double base;
        Double porcentaje;
    	Scanner entrada = new Scanner(System.in );
	System.out.println( "Ingrese el valor de la base para calcular: " );
	base = entrada.nextDouble();
        System.out.println( "Ingrese el valor de la base para calcular: " );
	porcentaje = entrada.nextDouble();
        System.out.println( calcular(base, porcentaje ));
        
    }

    private static double calcular(double base, java.lang.Double porcentaje) {
        ws.Calulador_Service service = new ws.Calulador_Service();
        ws.Calulador port = service.getCaluladorPort();
        return port.calcular(base, porcentaje);
    }
    
}
