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

    private int _entero;
    private String _cadena;
    private Date _fecha;

    public MiClase()
    {//constructor por defecto explicito
        
    }

    public MiClase(int nro, String texto, Date fecha)
    {
        //llamo al constructor que recibe el int y String
        this(nro,texto);        
        this._fecha = fecha;
        //this._entero = _entero;
        //this._cadena = _cadena;
    }

    public MiClase(int entero, String cadena)
    {
        this._entero = entero;
        this._cadena = cadena;
    }
  public MiClase(MiClase objeto)
    {
        //Como el "objeto" es de la misma clase puedo ver los atributos privados
        this(objeto._entero,objeto._cadena,objeto._fecha);
    }
  
    public void establecerValor(int nro)
    {
        this._entero = nro;
    }

    public void establecerValor(String texto)
    {
        this._cadena = texto;
    }

    public void establecerValor(Date fecha)
    {
        this._fecha = fecha;
    }

    public void mostrarDatos()
    {
        System.out.println("");
        System.out.println("Cadena " + this._cadena);
        System.out.println("Entero " + this._entero);
        System.out.println("Fecha " + this._fecha);
    }

}
