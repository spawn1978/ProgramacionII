/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones_teoria;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;

/**
 *
 * @author gferrer_mecon
 */
public class Excepciones_Teoria
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int x,y,z;
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese Nro: ");
        try
        {
             x= Integer.parseInt(lector.nextLine());
             y=Integer.parseInt(lector.nextLine());
             z=x/y;
            System.out.println("valor: " + x);
        }
        catch(NumberFormatException err)
        {
            System.out.println("ERROR - "+err.getMessage() + " " + err.getCause());
        }
        catch(ArithmeticException err)
        {
            System.out.println("ERROR - No se puede dividir por 0");
        }
        catch(Exception err)
        {
            System.out.println("ERROR (GEN)- " + err.getMessage());
        }
        finally
        {
            System.out.println("fin");
        }
        System.out.println("otro"); 
        
    }
        
}
