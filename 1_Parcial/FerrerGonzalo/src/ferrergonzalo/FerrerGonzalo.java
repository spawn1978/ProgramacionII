/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrergonzalo;

/**
 *
 * @author gferrer_mecon
 */
public class FerrerGonzalo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Biblioteca miBiblioteca = new Biblioteca(5);
        Autor a = new Autor("Esteban", "Rey");
        Autor b = new Autor("Joe", "Mayo");
        
        Manual m1 = new Manual(ETipo.FINANZAS, a, 500,"Economia para tontos");
        Novela n1 = new Novela(EGenero.ROMANTICA, a, 750, "El amor en tiempos de...");
        Manual m2 = new Manual(ETipo.ESCOLAR, new Autor("Moni","Argento"), 500,"Como criar a sus hijos");
        Manual m3 = new Manual(ETipo.TECNICO, b, 854,"Java, desde el punto de vista de C#");
        Novela n2 = new Novela(EGenero.ACCION, a, 410, "Miseria");
        Novela n3 = n2;       
        
        if (miBiblioteca.agregarLibro(m1))
        {
            System.out.println("Libro Agregado m1");
        } else
        {
            System.out.println("no Agrego m1");
        }
        if (miBiblioteca.agregarLibro(n1))
        {
            System.out.println("Libro Agregado n1");
        } else
        {
            System.out.println("no Agrego m1");
        }

        if (miBiblioteca.agregarLibro(m2))
        {
            System.out.println("Libro Agregado m2");
        } else
        {
            System.out.println(" no Agrego m2");
        }

        if (miBiblioteca.agregarLibro(n2))
        {
            System.out.println("Libro Agregado n2");
        } else
        {
            System.out.println("no Agrego n2");
        }

        if (miBiblioteca.agregarLibro(n3))
        {
            System.out.println("Libro Agregado n3");
        } else
        {
            System.out.println("No agrego n3");
        }
  
        if (!miBiblioteca.agregarLibro(m3))
        {
            System.out.println("\nEspacio Insuficiente \n");
        }
        
        System.out.println(Biblioteca.mostrarBiblioteca(miBiblioteca));    
        
    }
    
}
