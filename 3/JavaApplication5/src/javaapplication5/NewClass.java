/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author gferrer_mecon
 */
public class NewClass
{

    public int x;
    public String cadena;
    private static int _var1;    
    private static int _var2;

    public NewClass()
    {
        this.x = 2;
        this.cadena = "pepe";
    }
    
    static
    {
        _var1 = 3;
        _var2 = 6;
    }
/*
    private static int _var1 = inicializaStatic();
    public static int inicializaStatic()
    {//Funca pero no hay que usarla... es mejor la otra metodologia
        return 7;
    }
*/
    public NewClass(int entero, String texto)
    {
        this.x = entero;
        this.cadena = texto;
    }

}
