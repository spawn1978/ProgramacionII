/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_excepciones;

import java.util.Random;
import java.util.Scanner;

//import java.util.concurrent.TimeUnit   // para sleep

/**
 *
 * @author gferrer_mecon
 */
public class Ejer2_Excepciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int dato; int Opcion;
        do
        {            
            menu();
            Opcion = getNro("Ingrese Opcion: ");
            dato = RandomInt(1,100);
            switch(Opcion)
            {
                case 1: // Ingresar elemento
                    //<editor-fold desc="Pila.InsertarDato(dato);">
                        try
                        {
                            Pila.InsertarDato(dato);
                            System.out.println("Dato Ingresado: " + dato);
                        }
                        catch(DesbordePilaExcepcion e)
                        {
                            System.out.println(e.getMessage());
                        }
                    //</editor-fold>
                    break;
                case 2: // Quitar elemento
                    //<editor-fold desc="dato=Pila.ExtraerDato();">
                    try
                    {
                        dato=Pila.ExtraerDato();
                        System.out.println("--------------");
                        System.out.println("Dato Extraido: " + dato);
                    } 
                    catch (PilaVaciaExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }//</editor-fold>
                    break;
                case 3: // Mostrar elemento
                    for (int record : Pila.numeros)
                    {
                        System.out.println("Valor en Pila: " + record);
                    }
                    break;
                case 0: //salir
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            sleep(1);
            clearScreen();
        } while (Opcion != 0);
            
    }
    
    public static void menu()
    {
        System.out.println("1 - Ingresar elemento");
        System.out.println("2 - Quitar elemento");
        System.out.println("3 - Mostrar los elementos");
        System.out.println("0 - Salir");
    }
    
    public static int getNro(String sms)
    {        
        int Nro;
        Scanner lector = new Scanner(System.in);        
        System.out.print(sms); //saco datos por la consola
        Nro=lector.nextInt();        
        return Nro;
    }
    private static int RandomInt(int Min, int Max)
    {
        Random semilla = new Random();
        int Nro = semilla.nextInt(Max + 1 - Min);
        return Nro;
    }   
    
    public static void clearScreen() 
    {  
        System.out.println("\n\n");
        //System.out.print("\033[H\033[2J");
    }
    
    public static void sleep(int segundos) 
    {  
        try
        {
            Thread.sleep(segundos*1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }     
}
