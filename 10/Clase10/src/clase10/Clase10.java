/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

import java.util.ArrayList;

/**
 *
 * @author gferrer_mecon
 */
public class Clase10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Centralita Central1=new Centralita("Central cachito");
        
        ArrayList <Llamada> listaLlamadas;
        listaLlamadas=  Central1.Llamadas();
        
        listaLlamadas.add(new Local((float) 20.5, 10,"222","111") );
        listaLlamadas.add(new Local((float) 20.5, 10,"333","111") );
        
        listaLlamadas.add(new Provincial("111", E_Franja.Franja_1, 10, "222"));
        listaLlamadas.add(new Provincial("222", E_Franja.Franja_1, 10, "333"));
 
        
        Central1.mostrar();

        
    }
    
}
