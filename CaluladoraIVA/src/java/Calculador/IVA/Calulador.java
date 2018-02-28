/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculador.IVA;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Ingenieros
 */
@WebService(serviceName = "Calulador")
@Stateless()
public class Calulador {

        @WebMethod(operationName = "Calcular")
    public double Calcular(@WebParam(name = "Base") double Base, @WebParam(name = "Porcentaje") Double Porcentaje) {
    Base=Base * Porcentaje / 100;
        return Base ;
    }
    
    @WebMethod(operationName = "PerdirDatos")
    public double PerdirDatos(@WebParam(name = "producto1") double producto1, @WebParam(name = "producto2") double producto2) {
        double Base = producto1+producto2;
        return Base;
    }

    /**
     * Web service operation
     */


  
}
