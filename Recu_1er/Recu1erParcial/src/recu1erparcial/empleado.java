/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu1erparcial;

/**
 *
 * @author gferrer_mecon
 */
public class empleado extends persona
{
    protected int _legajo;
    
    public empleado(String nombre, int edad, int legajo)
    {
        super(nombre, edad);
        this._legajo=legajo;
    }
    
}
