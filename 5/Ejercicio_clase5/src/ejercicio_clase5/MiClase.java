/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase5;

import java.util.Date;

/**
 *
 * @author gferrer_mecon
 */
public class MiClase
{
    private int entero;
    private String cadena;
    private Date fecha;
    
    public void establecerValor(int nro)
    {
        this.entero=nro;
    }
    public void establecerValor(String texto)
    {
        this.cadena=texto;
    }
    public void establecerValor(Date fecha)
    {
        this.fecha=fecha;
    }
    
    public void mostrarDatos()
    {
        
    }
    
}
