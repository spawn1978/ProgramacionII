/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;


public class Camion extends Vehiculo
{
    protected float _tara;
    
    //<editor-fold desc="CONSTRUCTOR">   
        public Camion(Vehiculo unVehiculo, float tara)
        {
            super(unVehiculo.getPatente(),unVehiculo.getCantRuedas(),unVehiculo.getMarca());
            this._tara=tara;
        }
    //</editor-fold>
    
}
