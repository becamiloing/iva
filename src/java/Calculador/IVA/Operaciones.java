/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculador.IVA;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ingenieros
 */
@WebService(serviceName = "Front")
public class Operaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Calcular")
    public double Calcular (@WebParam(name = "Base") double Base, @WebParam(name = "Porcentaje") double Porcentaje) {
        //TODO write your implementation code here:
        return Base * Porcentaje / 100;
    }


}
