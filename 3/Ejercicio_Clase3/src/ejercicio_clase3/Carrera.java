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
        //sin vectores
        int NroAuto=1;
        Auto AutoGanador=auto1;
        
        if ( AutoGanador.getKilometrosRecorridos() < auto2.getKilometrosRecorridos() )
        {            
            AutoGanador=auto2;
            NroAuto=2;
        }
        if ( AutoGanador.getKilometrosRecorridos() < auto3.getKilometrosRecorridos() )
        {            
            AutoGanador=auto3;
            NroAuto=3;
        }
        if ( AutoGanador.getKilometrosRecorridos() < auto4.getKilometrosRecorridos() )
        {            
            AutoGanador=auto4;
            NroAuto=4;
        }
        if ( AutoGanador.getKilometrosRecorridos() < auto5.getKilometrosRecorridos() )
        {            
            AutoGanador=auto5;
            NroAuto=5;
        }
        if ( AutoGanador.getKilometrosRecorridos() < auto6.getKilometrosRecorridos() )
        {            
            AutoGanador=auto6;
            NroAuto=6;
        }
        
        
        
        System.out.println("Ganador: " + AutoGanador.getFabricante() + " KM: " + AutoGanador.getKilometrosRecorridos() + " Nro de Auto: " + NroAuto);
        System.out.println("------------ ");
        System.out.println("Km por cada corredor: ");
        System.out.println("Auto1: " + auto1.getKilometrosRecorridos());
        System.out.println("Auto2: " + auto2.getKilometrosRecorridos());
        System.out.println("Auto3: " + auto3.getKilometrosRecorridos());
        System.out.println("Auto4: " + auto4.getKilometrosRecorridos());
        System.out.println("Auto5: " + auto5.getKilometrosRecorridos());
        System.out.println("Auto6: " + auto6.getKilometrosRecorridos());
/*
        //falta mostrar
       for(int i=0 ;i<AutosCorredores.length;i++)
        {
            AutosCorredores[i]=new Auto(); //Inicializo cada posicion del vector con un Auto
        }    
  */
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
