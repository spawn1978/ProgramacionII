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
public class Local extends Llamada
{
    protected  float costo;

    //<editor-fold desc="contructor">
    public Local(Llamada unaLlamada, float costo)
    {
        super(unaLlamada._duracion, unaLlamada._nroDestino,unaLlamada._nroOrigen);
        this.costo = costo;
    }
    public Local(float costo, float _duracion, String _nroDestino, String _nroOrigen)
    {
        super(_duracion, _nroDestino, _nroOrigen);
        this.costo = costo;
    }
    //</editor-fold>
    //<editor-fold desc="PROPIEDADES">
        @Override public float getCostoLlamada()
        {
            float retorno;
            retorno=CalcularCosto();
            return retorno;
        }
    //</editor-fold>    
    //<editor-fold desc="METODOS">      
    private float CalcularCosto()
    {
        float retorno;
        retorno=this._duracion * this.costo;
        return retorno;
    }

    @Override public String mostrar()
    {        
        StringBuilder sms = new StringBuilder();
        //sms.append(super.mostrar());
        sms.append(super.toString());
        
        sms.append(" Costo llamada Local: ").append(this.getCostoLlamada());
        return sms.toString();        
    }
    
 
    
    @Override public boolean equals(Object unaLlamada)
    {
        return unaLlamada instanceof Local;
    }
    
    //</editor-fold>
    
}
