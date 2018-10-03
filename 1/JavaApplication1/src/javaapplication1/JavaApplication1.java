/*

 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author gferrer_mecon
 */
public class JavaApplication1 {
private static final int TAM = 100;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int cant=-1;
        int sumatoria=0;
        int [] Nros=new int[TAM];
                
        do
        {            
            cant++;
            Nros[cant]=getNro();            
        }while(Nros[cant]!=0);
        
        
        mostrar("El Mayor Nro ingresado es: " + getMayor(Nros) ); 
        
    }
    
    private static int getMayor(int[] Numeros )
    {
        int Mayor=0;
        for(int i=0;i<TAM;i++)
        {
            if( ComparaNros(Mayor,Numeros[i]) == -1 )
            {
                Mayor=Numeros[i];
            }
        }
        return Mayor;
    }
    
    private static void mostrar( String sms)
    {
        System.out.println(sms);        
    }
    
    private static int ComparaNros( int Nro1, int Nro2)
    {
        int retorno=9;
        if(Nro1>Nro2)
        {           
            retorno=1;
        }
        if( Nro1==Nro2)
        {
            retorno=0;
        }
        if(Nro1<Nro2)
        {
            retorno=-1;
        }            
        return retorno;
    }
    
    public static int getNro()
    {
        int Numero;               
        Scanner lector = new Scanner(System.in);        
        System.out.println("Ingrese un Nro: "); //saco datos por la consola
        Numero=lector.nextInt();//tomo datos de la consola
        return Numero;
    }
    
}
