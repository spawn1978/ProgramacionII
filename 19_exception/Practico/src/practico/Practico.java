/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico;

/**
 *
 * @author gferrer_mecon
 */
public class Practico
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            //Practico.dividir(2);
            //Practico.dividir(0);
            Practico.f1(-1);
        }
        catch(Exception Err)
        {
            System.out.println( Err.getMessage());
        }
        
        
    }
    
    
    public static void f1(int x) throws Exception
    {
        try
        {
            Practico.f2(x);
        }
        catch(Exception Err)        
        {
            throw new Exception(Err.getMessage() + "\nERROR - F1 ");            
        }
        
    }
    public static void f2(int x) throws Exception
    {
        try
        {
            Practico.f3(x);
        }
        catch(Exception Err)        
        {
            throw new Exception(Err.getMessage() + "\nERROR - F2 ");            
        }
    }
    public static void f3(int x) throws Exception
    {
        try
        {
            Practico.f4(x);
        }
        catch(Exception Err)        
        {
            throw new Exception(Err.getMessage() + "\nERROR - F3 ");            
        }
    }
    public static void f4(int x) throws Exception
    {
        if(x<0)
        {
            throw new Exception("ERROR - F4 ");
        }
    }
    
    public static void dividir(int divisor) throws Exception
    {
        if(divisor==0)
        {
            throw new Exception("No se puede dividir por 0 ");
        }
        else
        {
            System.out.println(10/divisor);
        }
    }
}
