/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

import java.util.ArrayList;



/**
 *
 * @author gferrer_mecon
 */
public class Centralita
{
    protected String _razonSocial;       
    private ArrayList <Llamada> _listaDeLlamadas;
    
    //<editor-fold desc="CONSTRUCTOR">    
    public Centralita()
    {
        _listaDeLlamadas = new ArrayList<>();        
    }
    
    public Centralita(String RazonSocial)
    {
        this();
        this._razonSocial=RazonSocial;
    }
    //</editor-fold>
    
    //<editor-fold desc="PROPIEDADES">    
    
    public float GananciaPorLocal()
    {
        return this.CalcularGanancia(E_TipoLlamada.Local);
    }
    
    public float GananciaPorProvincial()
    {
        return this.CalcularGanancia(E_TipoLlamada.Provincial);
    }
    
    public float GananciaTotal()
    {
        return this.CalcularGanancia(E_TipoLlamada.Todas);
    }
    //</editor-fold>
   
    
    //<editor-fold desc="METODOS">
    public void mostrar()
    {
       StringBuilder cadena = new StringBuilder();
        
        cadena.append("Resumen de Centralita").append("\n");
        cadena.append("---------------------").append("\n");
        cadena.append("         Razón Social: ").append(this._razonSocial).append("\n");
        cadena.append("     Ganancia Locales: ").append(this.GananciaPorLocal()).append("\n");
        cadena.append("Ganancia Provinciales: ").append(this.GananciaPorProvincial()).append("\n");
        cadena.append("    Ganancias Totales: ").append(this.GananciaTotal()).append("\n");
        cadena.append("---------------------").append("\n");
        cadena.append("Detalle de Llamadas").append("\n");
        cadena.append("---------------------").append("\n");
        
        System.out.println(cadena.toString());
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local)
            {
                ((Local) unaLlamada).mostrar();
            }
            else if(unaLlamada instanceof Provincial)
            {
                ((Provincial) unaLlamada).mostrar();
            }
        }
    }
     
    private float CalcularGanancia(E_TipoLlamada tipo)
    {
        float ganancia = 0.0F;
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local && tipo != E_TipoLlamada.Provincial)
            {
                ganancia += ((Local) unaLlamada).CostoLlamada();
            }
            else if(unaLlamada instanceof Provincial && tipo != E_TipoLlamada.Local)
            {
                ganancia += ((Provincial) unaLlamada).CostoLlamada();
            }
        }
        
        return ganancia;
    }
    public ArrayList <Llamada> Llamadas()
    {
        return this._listaDeLlamadas;
    }
    //</editor-fold>
}
