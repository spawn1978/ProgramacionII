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
public class Teoria_Herencia
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        ClassHija ninio=new ClassHija( 10,20,30);
        ninio.mostrarHija();
        System.out.println("------");
        ninio.mostrarPadre();
    }
    
}
