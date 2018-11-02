/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_clase9;

/**
 *
 * @author gferrer_mecon
 */
public class Empleado extends SerHumano
{

    private long sueldo;
    public Empleado(String _nombre, byte _peso, byte _altura, String _sexo, long sueldo)
    {
        super(_nombre, _peso, _altura, _sexo);
        this.sueldo=sueldo;
    }
 
    public void trabajar()
    {
        System.out.println("Trabajando");
    }
}
