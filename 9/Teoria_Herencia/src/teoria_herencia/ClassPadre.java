/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_herencia;

/**
 *
 * @author gferrer_mecon
 */
public class ClassPadre extends ClassAbuelo
{
    private int _x;
    protected int _y;
    
    ClassPadre(int x, int y)
    {
        super(x);
        this._x=x;
        this._y=y;
    }
    
    ClassPadre(int a)
    {
        super(a);
    }
    
    protected void mostrarPadre ()
    {
        System.out.println("Padre x: " + this._x);
        System.out.println("Padre y: " + this._y);
        System.out.println("Heredado Abuelo: " + this.getA());
    }
}
