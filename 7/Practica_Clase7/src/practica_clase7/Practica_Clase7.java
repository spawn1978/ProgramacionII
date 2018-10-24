/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_clase7;

import java.util.ArrayList;


/**
 *
 * @author gferrer_mecon
 */
public class Practica_Clase7
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        //        //<editor-fold desc="Practica solo con lista de perros">

            Perro animal1=new Perro("lolo", 10, eRaza.SALCHICHA);

            //animal1.mostrarPerro(animal1);  // Conseptualmente esta mal llamarlo asi.. pq al ser static deberia de llamarse a travez de la clase Perro

            Perro.mostrarPerro(animal1);


            ArrayList <Perro> listaPerros;
            listaPerros=new ArrayList<>();
            listaPerros.add( new Perro("p1", 10, eRaza.PERRO));
            listaPerros.add( new Perro("p2", 20, eRaza.PERRO));        
            listaPerros.add( new Perro("p3", 30, eRaza.PERRO));
            listaPerros.add( new Perro("p4", 40, eRaza.PERRO));
            Perro perro5=listaPerros.get(2);        
            listaPerros.add(perro5);

            Boolean sonIguales;
            sonIguales=listaPerros.get(2).equals(listaPerros.get(4));
            System.out.println(sonIguales);
            System.out.println("-------");
            for (int i = 0; i < listaPerros.size(); i++)
            {
                System.out.print("Pos: " + i + " ");
                Perro.mostrarPerro(listaPerros.get(i));            
            }

            listaPerros.remove(listaPerros.get(2));
            listaPerros.remove(0);

            System.out.println("-------");
            for (Perro listaPerro : listaPerros)
            {
                Perro.mostrarPerro(listaPerro);
            }
        //</editor-fold>
        */
        
        Veterinaria vet1=new Veterinaria("La Cucha");
        vet1.agregarPerro(new Perro("lobo", 10, eRaza.PERRO));
        vet1.agregarPerro(new Perro("lola", 10, eRaza.POLICIA));
        
                
        vet1.mostrarVeterinaria();
    }
    
}
