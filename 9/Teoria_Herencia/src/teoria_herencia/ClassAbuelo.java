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
public class ClassAbuelo
{
    private int _a;

    public ClassAbuelo(int a)
    {
        this._a=a;
    }
    
    protected int getA()
    {
        return this._a;
    }
}
