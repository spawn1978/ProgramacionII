/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_clase7;

import java.util.ArrayList;

/**
 *
 * @author gferrer_mecon
 */
public class Veterinaria
{
    private String _nombre;
    private ArrayList <Perro> _lista;

    public Veterinaria(String _nombre)
    {
        this._nombre = _nombre;
        this._lista=new ArrayList<>();
    }

    public String getNombre()
    {
        return _nombre;
    }
    
    public int agregarPerro(Perro animal)
    {
        int retorno=-1;
        
        for (int i = 0; i < this._lista.size()||this._lista.isEmpty(); i++)
        {             
            if(this._lista.isEmpty() || !this._lista.get(i).equals(animal) )
            {
                this._lista.add(animal);
                retorno=0;
            } 
        }       
        return retorno;        
    }
    
    public void mostrarVeterinaria()
    {
        System.out.println("Veterinaria:" +this._nombre);
        System.out.println("---------------");
        for (Perro perro : this._lista)
        {            
            Perro.mostrarPerro(perro);
        }
    }
}
