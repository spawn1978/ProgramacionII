/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtroPackages;

import teoria_herencia.ClassHija;

/**
 *
 * @author gferrer_mecon
 */
public class ClassMundoParalelo
{
    ClassHija hijaParalelo=new ClassHija(10,2,3);
    
    void mostrarParalelo()
    {
        hijaParalelo.mostrarHija();
    }
    
}
