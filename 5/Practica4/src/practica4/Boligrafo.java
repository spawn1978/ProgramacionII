/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;

/**
 *
 * @author gferrer_mecon
 */
public class Boligrafo
{

    private Color _color;
    private int _tinta;
    private static final int MAXIMA_TINTA = 100;
    
    public Boligrafo(Color colorBoligrafo, int cantidadTinta)
    {
        if (colorBoligrafo != null && cantidadTinta > 0 && cantidadTinta <= Boligrafo.MAXIMA_TINTA)
        {
            this._color = colorBoligrafo;
            this._tinta = cantidadTinta;
        }
    }

    public boolean Pintar(int gasto)
    {
        boolean retorno;

        if (this._tinta - gasto < 0)
        {
            retorno = false;
        } else
        {
            this._tinta -= gasto;
            retorno = true;
        }
        return retorno;
    }

    public void Recargar()
    {
        this._tinta = Boligrafo.MAXIMA_TINTA;
    }

    public Color getColor()
    {
        return this._color;
    }

    public int getTinta()
    {
        return this._tinta;
    }
    
}
