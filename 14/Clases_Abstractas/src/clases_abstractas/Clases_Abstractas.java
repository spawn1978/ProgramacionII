/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;

/**
 *
 * @author gferrer_mecon
 */
public class Clases_Abstractas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        ClaseDos dos=new ClaseDos("pepe", 10);
        ClaseTres tres=new ClaseTres(dos, 20);
        
        System.out.println(tres.mostrarTres());
        
    }
    
}
