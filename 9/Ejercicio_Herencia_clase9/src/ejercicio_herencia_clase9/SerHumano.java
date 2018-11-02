/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_clase9;



/**
 *
 * @author gferrer_mecon
 */
public class SerHumano
{
    private String _nombre;
    private byte _peso;
    private byte _altura;
    private String _sexo;

    
    public SerHumano()
    {
        
    }
    public SerHumano(String _nombre, byte _peso, byte _altura, String _sexo)
    {
        this._nombre = _nombre;
        this._peso = _peso;
        this._altura = _altura;
        this._sexo = _sexo;
    }
    
    
    
    //<editor-fold desc="METODOS">    
        void  comer( String comida)
        {
            System.out.println("Comiendo: " + comida);
        }

        void  dormir()
        {
            System.out.println("... Durmiendo ... ");
        }
    //</editor-fold>
    
}
