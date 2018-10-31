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
public class ClassHija extends ClassPadre
{
    private  int _z;
    public ClassHija(int x, int y,int z)
    {
        super(x, y);
        this._z=z;
    }
    
    public ClassHija(int a)
    {
        super(a);
    }

    public void mostrarHija()
    {
        this.mostrarPadre();
        System.out.println("Hija z: " + this._z);
    }
}
