/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_calculadora;
import java.util.Scanner;
/**
 *
 * @author gferrer_mecon
 */
public class Ejercicio2_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Numero1;
        int Numero2;        
        
        Numero1=IngresoNro();
        calculadora.SetOperador( IngresoOperador() );
        Numero2=IngresoNro();
        
        calculadora.CalcularOperacion(Numero1, Numero2);
        System.out.println(" ------- ");    
        System.out.print(Numero1);
        System.out.print(" ");        
        System.out.print(calculadora.GetOperador() );
        System.out.print(" ");        
        System.out.print( Numero2 );
        System.out.print(" = ");        
        System.out.println(calculadora.MostrarResultado() );
    }
    
    public static int IngresoNro()
    {
        int Numero;               
        Scanner lector = new Scanner(System.in);        
        System.out.println("Ingrese un Nro: "); //saco datos por la consola
        Numero=lector.nextInt();//tomo datos de la consola
        return Numero;
    }    
    
    public static char IngresoOperador()
    {
        String buffer;
        char op=' ';
        Scanner lector = new Scanner(System.in);        
        System.out.println("Ingrese operacion  +  -  *  / : "); //saco datos por la consola
        buffer=lector.next();//tomo datos de la consola
        
        if(buffer.length()==1)
        {
            op=buffer.charAt(0);
        }
        return op;
    }
}
