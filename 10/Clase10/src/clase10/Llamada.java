/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

/**
 *
 * @author gferrer_mecon
 */
abstract public class Llamada
{
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen;
    
    //<editor-fold desc="GETTERS">
        public float getDuracion()
    {
        return _duracion;
    }

    public String getNroDestino()
    {
        return _nroDestino;
    }

    public String getNroOrigen()
    {
        return _nroOrigen;
    }
    //</editor-fold>
    //<editor-fold desc="constructor">

        public Llamada(float _duracion, String _nroDestino, String _nroOrigen)
        {
            this._duracion = _duracion;
            this._nroDestino = _nroDestino;
            this._nroOrigen = _nroOrigen;
        }

    //</editor-fold>
    //<editor-fold desc="METODOS">
        abstract public float getCostoLlamada();        
        abstract  protected  String mostrar();
//        protected  String mostrar()
//        {
//            StringBuilder sms = new StringBuilder();
//            sms.append("LLamada de: ").append(this._nroOrigen);
//            sms.append(" TO ").append(this._nroDestino);
//            sms.append(" Duracion: ").append(this._duracion);
//            
//            return sms.toString();
//        }        
        
//        @Override public String toString()
//        {
//            return this.mostrar();
//        }

        @Override public String toString()
        {
            StringBuilder sms = new StringBuilder();
            sms.append("LLamada de: ").append(this._nroOrigen);
            sms.append(" TO ").append(this._nroDestino);
            sms.append(" Duracion: ").append(this._duracion);
            return sms.toString();
        }
        
        public int OrdenarPorDuracion(Llamada uno, Llamada dos)
        {
            int retorno=-1;
            if(uno.getDuracion() > dos.getDuracion())
            {
                retorno =1;
            }
            else
            {
                if(uno.getDuracion() == dos.getDuracion())
                {
                    retorno =0;
                }
            }            
            return retorno;
        }
        public boolean compararLlamadas(Llamada unaLlamada, Llamada otraLlamada)
        {
            boolean origenIgual =  unaLlamada._nroOrigen == otraLlamada._nroOrigen ;
            boolean destinoIgual = unaLlamada._nroDestino == otraLlamada._nroDestino ;
            return origenIgual == destinoIgual;
        }
    //</editor-fold>

 


}
