/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;


public class Auto extends Vehiculo
{
    protected int _cantidadAsientos;
    
    //<editor-fold desc="CONSTRUCTOR">
    public Auto(String _patente, eMarca _marca, int cantidadAsientos )
    {
        super(_patente,0, _marca);
        this._cantidadAsientos=cantidadAsientos;
    }
    
    public Auto(String _patente, int _cantRuedas, eMarca _marca, int cantidadAsientos )
    {
        super(_patente, _cantRuedas, _marca);
        this._cantidadAsientos=cantidadAsientos;
    }
    //</editor-fold>
    
    
}
