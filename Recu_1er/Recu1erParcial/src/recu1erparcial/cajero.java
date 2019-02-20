/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu1erparcial;


public class cajero extends empleado
{
    private float _sueldo;
    
    public cajero(String nombre, int edad, int legajo, float sueldo)
    {
        super(nombre, edad, legajo);
        this._sueldo=sueldo;
    }
    
}
