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
public class Carrera
{
    
    private Auto auto1;
    private Auto auto2;
    private Auto auto3;
    private Auto auto4;
    private Auto auto5;
    private Auto auto6;
    
    private static final int CANTCORREDORES = 10;    
    Auto [] AutosCorredores=new Auto [CANTCORREDORES];
    
    public Carrera()
    {//constructor
        this.auto1=new Auto();
        this.auto2=new Auto();
        this.auto3=new Auto();
        this.auto4=new Auto();
        this.auto5=new Auto();
        this.auto6=new Auto();

        for(int i=0 ;i<AutosCorredores.length;i++)
        {
            AutosCorredores[i]=new Auto(); //Inicializo cada posicion del vector con un Auto
        }        
    }
    
    public void mostrarCarrera()
    {
        //falta mostrar
       for(int i=0 ;i<AutosCorredores.length;i++)
        {
            AutosCorredores[i]=new Auto(); //Inicializo cada posicion del vector con un Auto
        }    
  
    }
    
    public void porTiempo(int minutos)
    {
        for (int i = 0; i < minutos; i++)
        {
            auto1.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            auto2.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            auto3.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            auto4.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            auto5.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            auto6.setKilometrosRecorridos( (int) ( Math.random()* 1000 )  );
            
            for (int j = 0; j < AutosCorredores.length; j++)
            {
                AutosCorredores[j].setKilometrosRecorridos( (int) ( Math.random()* 1000 )   );
            }
        }
    }
    
}
