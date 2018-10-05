/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_calculadora;

/**
 *
 * @author gferrer_mecon
 */
public class calculadora {
    private static int resultado;
    private static char operador;
        
    private static void sumar(int Nro1, int Nro2)
    {
        resultado=Nro1+Nro2;
    }
    
    private static void restar(int Nro1, int Nro2)
    {
        resultado=Nro1-Nro2;
    }    
    
    private static void multiplicar(int Nro1, int Nro2)
    {
        resultado=Nro1*Nro2;
    }
    private static void dividir(int Nro1, int Nro2)
    {
        resultado=Nro1/Nro2;
    }
    
    public static int MostrarResultado()
    {
        return resultado;
    }

    public static void SetOperador(char OP)
    {
        operador=OP;
    }
    
    public static char GetOperador()
    {
        return operador;
    }    
    
    public static void CalcularOperacion(int Nro1,int Nro2)           
    {
        switch(operador)
        {
            case '+' :
                sumar(Nro1,Nro2);
                break;
            case '-' :
                restar(Nro1,Nro2);
                break;
            case '*' :
                multiplicar(Nro1,Nro2);
                break;    
            case '/' :
                dividir(Nro1,Nro2);
                break;
            default:
                
        }        
    }    
    
    
}
