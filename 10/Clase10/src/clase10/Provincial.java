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
public class Provincial extends Llamada
{
    protected  float _costo;
    protected E_Franja _franjaHoraria;

    //<editor-fold desc="CONSTRUCTORES">    
        public Provincial(E_Franja mFranja, Llamada unaLlamada)
        {
            super(unaLlamada._duracion, unaLlamada._nroDestino,unaLlamada._nroOrigen);
            this._franjaHoraria=mFranja;               
        }
        public Provincial(String _nroOrigen,E_Franja franja ,float _duracion, String _nroDestino)
        {
            super(_duracion, _nroDestino, _nroOrigen);
            this._franjaHoraria=franja;
//            switch(franja)
//            {
//                case Franja_1:
//                    this._costo = 0.99F;
//                    break;
//                case Franja_2:
//                    this._costo = 1.25F;
//                    break;
//                case Franja_3:
//                    this._costo = 0.66F;
//                    break;
//                default:
//                    this._costo = 0.0F;
//            }
        }
    //</editor-fold>
      @Override public float getCostoLlamada()
      {
          float retorno;
          retorno=CalcularCosto();
          return retorno;
      }
    //<editor-fold desc="METODOS">
       private float CalcularCosto()
       {
           float retorno;
            switch(this._franjaHoraria)
            {
                case Franja_1:
                    this._costo = 0.99F;
                    break;
                case Franja_2:
                    this._costo = 1.25F;
                    break;
                case Franja_3:
                    this._costo = 0.66F;
                    break;
                default:
                    this._costo = 0.0F;
            }
           retorno=this._duracion * this._costo;
           return retorno;
       }
        @Override public String mostrar()
        {                       
            StringBuilder sms = new StringBuilder();
            //sms.append(super.mostrar());
            sms.append(super.toString());
            sms.append(" Costo llamada Provincial: ").append(this.getCostoLlamada());
            sms.append("  Franja: ").append(this._franjaHoraria);
            return sms.toString();
        }
        
        @Override public boolean equals(Object unaLlamada)
        {
            return unaLlamada instanceof Local;
        }
    //</editor-fold>
    
}
