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
        //<editor-fold desc="Teoria Herencia">
        /*
            privado solo ven los de la clase
            protected solo ven los del mismo package
            prublic lo ven todos
        */
        //</editor-fold>
        
        
        ClassHija ninio=new ClassHija( 10,20,30);
        ninio.mostrarHija();
        System.out.println("======");
        ninio.mostrarPadre();
        System.out.println("======");
        ClassAbuelo Abuelo;
        Abuelo = new ClassHija(10, 10, 30);
        System.out.println("Abuelo getA: " + Abuelo.getA());
        System.out.println("------");
        ClassHija hija = (ClassHija) Abuelo;
        hija.mostrarHija();
    }
    
}
