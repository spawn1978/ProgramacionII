/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;


public class Moto extends Vehiculo
{
    protected float _cilindrada;
    
    //marca, cilindrada, patente y cantidad de ruedas
    public Moto(float cilindrada,String _patente, int _cantRuedas)
    {
        super(_patente, _cantRuedas, eMarca.ZANELLA);
        this._cilindrada=cilindrada;
    }
    
}
