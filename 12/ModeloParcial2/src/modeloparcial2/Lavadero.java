/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gferrer_mecon
 */
public class Lavadero
{
    private ArrayList <Vehiculo> _Vehiculos;
    static float _precioCamion;
    static float _precioAuto;
    static float _precioMoto;
    private String _razonSocial;
    
    //<editor-fold desc="CONSTRUCTORES">
        private Lavadero()
        {
            this._Vehiculos=new ArrayList<>();        
        }
        public Lavadero( String _razonSocial)
        {
            this();                
            this._razonSocial = _razonSocial;
        }

        static
        { //El constructor estático inicializara, mediante un valor aleatorio cada uno de los precios. 
          //  El rango irá desde los $150 a los $565. (No deben repetirse)
          Lavadero._precioAuto=genRandom();
            do
            {            
                Lavadero._precioCamion=genRandom();
            } while (Lavadero._precioCamion==Lavadero._precioAuto);

            do
            {            
                Lavadero._precioMoto=genRandom();
            } while ( (Lavadero._precioMoto == Lavadero._precioAuto) || ( Lavadero._precioMoto == Lavadero._precioCamion));
        }
    //</editor-fold>

    //<editor-fold desc="METODOS">
        private static float genRandom()
        {
            int MIN=150; int MAX=565;
            Random semilla=new Random();        
            float Nro = MIN + semilla.nextFloat() * (MAX - MIN);
            return Nro;    
        }
        public String LavaderoString()
        {
            StringBuilder cadena=new StringBuilder();
                cadena.append("RazonSocial: ").append(this._razonSocial);
                cadena.append(" Precio Autos: ").append(Lavadero._precioAuto);
                cadena.append(" Precio Camion: ").append(Lavadero._precioCamion);
                cadena.append(" Precio Moto: ").append(Lavadero._precioMoto);
                cadena.append("\n----------- VEHICULOS -----------\n");
                for (Vehiculo unVehiculo : this._Vehiculos)
                {
                    cadena.append(unVehiculo.mostrar());
                    cadena.append("\n");
                }

            return cadena.toString();
        }        
        public  ArrayList <Vehiculo> getListaVehiculos()
        {
            return this._Vehiculos;        
        }       

        private float getPrecioVehiculo(EVehiculos tipo)
        {
            float precio=0;
            if(tipo == EVehiculos.AUTO)
            {
                precio = _precioAuto;
            }
            if(tipo == EVehiculos.CAMION)
            {
                precio = _precioCamion;
            }
            if(tipo == EVehiculos.MOTO)
            {
                precio = _precioMoto;
            }            
            return precio;            
        }
        
        public double MostrarTotalFacturado(EVehiculos TipoVehiculo)
        {//MostrarTotalFacturado: retornará la ganancia del Lavadero por tipo de vehículo.
            double retorno=0;
            float precio=getPrecioVehiculo(TipoVehiculo);
            
            for (Vehiculo unVehiculo : _Vehiculos) 
            {
                if ( TipoVehiculo == Vehiculo.getTipoVeiculo(unVehiculo) )
                {
                    retorno+= precio;
                }
            }//fin for            
            return retorno;
        }
        public double MostrarTotalFacturado()
        {//MostrarTotalFacturado: devolverá la ganancia total del lavadero (Double)
            double retorno =0;
            for (Vehiculo unVehiculo : _Vehiculos) 
            {
                retorno += getPrecioVehiculo( Vehiculo.getTipoVeiculo(unVehiculo) );
            }
            return retorno;
        }
        
/*
 El método EstaEnLavadero(Lavadero,Vehículo) retornara TRUE, si el vehículo se encuentra
en el lavadero.
        
 El método EstaEnLavadero(Vehículo,Lavadero) retorna -1 si no está el vehículo en el
lavadero, caso contrario, retorna el índice de donde se encuentra dicho vehículo.
        
 El método AgregarVehiculo, agregara un vehiculo al lavadero siempre y cuando el vehículo
no se encuentre en el lavadero. Ej. Lavadero.AgregarVehiculo(unLavadero, unAuto);
        
 El método QuitarVehiculo, quitara un vehiculo al lavadero siempre y cuando el vehículo no
se encuentre en el lavadero. Ej. unLavadero.QuitarVehiculo(unaMoto);
        
 Generar un método estático (OrdenarVehiculosPorPatente : int) que reciba dos vehículos y
retorne un 0 (cero), si ambas patentes son iguales, si la primera patente es ‘mayor’ que la
segunda, retornará un 1 (uno) y si no, retornará un -1 (menos uno).
        
 Generar un método de instancia (OrdenarVehiculosPorMarca : int) que reciba dos
vehículos retorne un 0 (cero), si ambas marcas son iguales, si la primera marca es ‘mayor’
que la segunda, retornará un 1 (uno) y si no, retornará un -1 (menos uno).
        */
    //</editor-fold>        
    
}
