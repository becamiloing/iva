/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import javax.jws.WebService;

/**
 *
 * @author Ingenieros
 */
@WebService(serviceName = "Front", portName = "OperacionesPort", endpointInterface = "calculador.iva.Operaciones", targetNamespace = "http://IVA.Calculador/", wsdlLocation = "WEB-INF/wsdl/Cliente/localhost_8080/IVA/Front.wsdl")
public class Cliente {

    public double calcular(double base, double porcentaje) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
