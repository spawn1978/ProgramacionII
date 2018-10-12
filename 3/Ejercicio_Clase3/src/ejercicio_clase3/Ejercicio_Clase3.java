/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase3;



/**
 *
 * @author gferrer_mecon
 */
public class Ejercicio_Clase3
{
    private static final int TAM = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        Rueda rueda1=new Rueda();
        Rueda rueda2=new Rueda();
        Rueda rueda3=new Rueda();
        */
        /*
        for(int i=0 ;i<TAM;i++)
        {        
            Auto auto1 = new Auto();
            auto1.saludo();              
        }
         */
        
        Auto [] Concesionario=new Auto [TAM];  // asigna memoria para TAM elementos de Auto
        
        for(int i=0 ;i<TAM;i++)
        {
            Concesionario[i]=new Auto(); //Inicializo cada posicion del vector con un Auto
            //Concesionario[i].saludo();
        }

        for(int i=0 ;i<TAM;i++)
        {
            int km=(int) ( Math.random()* 1000 );
            Concesionario[i].setKilometrosRecorridos(km);
            Concesionario[i].MostrarCarrera();
        }
        
    }

}
