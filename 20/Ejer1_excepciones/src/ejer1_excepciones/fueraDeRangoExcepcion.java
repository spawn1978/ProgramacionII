/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_excepciones;

/**
 *
 * @author gferrer_mecon
 */
public class fueraDeRangoExcepcion extends Exception
{
    public fueraDeRangoExcepcion(String mensaje)
    {
        super(mensaje);
    }
}
