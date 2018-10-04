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
        
        
        mostrar("El Mayor Nro ingresado es: " + getMayor(Nros,cant) ); 
        mostrar("El Menor Nro ingresado es: " + getMenor(Nros,cant) ); 
        mostrar("La sumatoria de los nros es: " + getSumatoria(Nros,cant) ); 
        mostrar("El promedio es: " + getSumatoria(Nros,cant)/cant ); 
        mostrar("El Cantidad de Nros positivos: " + getCantPositivos(Nros) ); 
        mostrar("El Cantidad de Nros Negativos: " + getCantNegativos(Nros) ); 
        mostrar("%Nros Positivos: " + getCantPositivos(Nros) *100 / cant + "%");
        mostrar("%Nros Negativos: " + getCantNegativos(Nros) *100 / cant + "%");
        mostrar("Promedio de Nros Positivos: " + getPromedioPositivos(Nros) ); 
        
        mostrar("Cantidadde Nros Pares: " + getCantPares(Nros,cant) ); 
        mostrar("Cantidadde Nros Impares: " + getCantImpares(Nros,cant) ); 
        
    }
    
    public static int getCantPares(int [] Numeros,int cantidad)
    {
        int retorno=0;
        for (int i = 0; i < cantidad; i++) {
            if( esPar(Numeros[i]) == true )
            {
                retorno ++;
            }            
        }
        return retorno;
    }

    public static int getCantImpares(int [] Numeros ,int cantidad)
    {
        int retorno=0;
        for (int i = 0; i <cantidad; i++) {
            if( esPar(Numeros[i]) == false )
            {
                retorno ++;
            }            
        }
        return retorno;
    }
    
    private static boolean esPar(int numero)
    {
        boolean retorno;
        if (numero%2==0)
        {
            retorno=true;
        }
        else
        {
            retorno=false;
        }
        return retorno;
    }
    
    public static int getSumatoria(int [] Numeros, int cantidad)
    {
        int retorno=0;
        for (int i = 0; i < Numeros.length; i++) {
            retorno += Numeros[i];            
        }
        return retorno;
    }
    
    private static float getPromedioPositivos(int [] Numeros)
    {
        float retorno=0;
        int sumatoria=0;
        int cantidad=0;
        for (int i = 0; i < Numeros.length; i++) {
            if( Numeros[i]>0)
            {
                sumatoria+=Numeros[i];
                cantidad ++;
            }            
        }
        retorno=sumatoria/cantidad;
        return retorno;
    }
    private static int getCantPositivos(int[] Numeros)
    {
        int retorno=0;
        for (int i = 0; i < Numeros.length; i++) {
            
            if(Numeros[i]>0)
            {
                retorno++;
            }            
        }
        return retorno;
    }
    private static int getCantNegativos(int[] Numeros)
    {
        int retorno=0;
        for (int i = 0; i < Numeros.length; i++) {
            
            if(Numeros[i]<0)
            {
                retorno++;
            }            
        }
        return retorno;
    }
    
    private static int getMayor(int[] Numeros, int cantidad )
    {
        int Mayor = 0; //para que no me putee el compilador pero esta de mas...
        int flag=0; 
        for(int i=0;i<cantidad;i++)
        {
            if( flag==0 || ComparaNros(Mayor,Numeros[i]) == -1 )
            {
                flag=1;
                Mayor=Numeros[i];
            }
        }
        return Mayor;
    }
    private static int getMenor(int[] Numeros ,int cantidad)
    {
        int Menor = 0; //para que no me putee el compilador pero esta de mas...
        int flag=0; 
        for(int i=0;i<cantidad;i++)
        {
            if( flag==0 || ComparaNros(Menor,Numeros[i]) == 1 )
            {
                flag=1;
                Menor=Numeros[i];
            }
        }
        return Menor;
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
