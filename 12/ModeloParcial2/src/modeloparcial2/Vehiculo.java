/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

/**
 *
 * @author gferrer_mecon
 */
public class Vehiculo
{
    private String _patente;
    private int _cantRuedas;
    private eMarca _marca;

    
    //<editor-fold desc="CONSTRUCTOR">
        public Vehiculo(String _patente, int _cantRuedas, eMarca _marca)
        {
            this._patente = _patente;
            this._cantRuedas = _cantRuedas;
            this._marca = _marca;
        }
    //</editor-fold>

    //<editor-fold desc="GETTES Y SETERS">
        public String getPatente()
        {
            return _patente;
        }

        public int getCantRuedas()
        {
            return _cantRuedas;
        }

        public eMarca getMarca()
        {
            return _marca;
        }    
    //</editor-fold>

    //<editor-fold desc="METODOS">
    
        protected String mostrar()
        {
            StringBuffer cadena = new StringBuffer();
            cadena.append(" Patente: ").append(this._patente);
            cadena.append(" Marca: ").append(this._marca);
            cadena.append(" Cant Ruedas: ").append(this._cantRuedas);
            return cadena.toString();
        }

        public static boolean ComparaVehiculos(Vehiculo unVehiculo, Vehiculo otroVehiculo)
        {//boolean. Si las patentes y marcas son iguales, retorna TRUE.
            boolean igualPatente = unVehiculo._patente==otroVehiculo._patente;
            boolean igualMarca = unVehiculo._marca==otroVehiculo._marca;
            return igualMarca == igualMarca;
        }
        
        public static EVehiculos getTipoVeiculo(Vehiculo unVehiculo)
        {
            EVehiculos tipo = null;
            if(unVehiculo instanceof Auto)
            {
                tipo=EVehiculos.AUTO;   
            }
            if(unVehiculo instanceof Camion)
            {
                tipo=EVehiculos.CAMION;  
            }
            if(unVehiculo instanceof Moto)
            {
                tipo=EVehiculos.MOTO;
            }
            return tipo;
        }

    //</editor-fold>
}
