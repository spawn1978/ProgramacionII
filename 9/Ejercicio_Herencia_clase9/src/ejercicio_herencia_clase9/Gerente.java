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
public class Gerente extends SerHumano
{

     
    public Gerente(String _nombre, byte _peso, byte _altura, String _sexo)
    {
        super(_nombre, _peso, _altura, _sexo);
    }
    
    public void main()
    {
        System.out.println("rascandose...");
    }
}
