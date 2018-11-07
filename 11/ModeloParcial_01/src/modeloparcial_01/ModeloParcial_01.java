/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial_01;

import java.util.ArrayList;



/**
 *
 * @author gferrer_mecon
 */
public class ModeloParcial_01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Producto ProductoUno = new Producto(666,"JamonDelDiablo", eTipoComestible.Solido,2);
            Producto ProductoDos = new Producto(33, "JamonDeDios", eTipoComestible.Solido,10);
            Producto ProductoTres = new Producto(55, "Sprite", eTipoComestible.Liquido, 10); 
            Producto ProductoCuatro = new Producto(666, "JamonDelDiablo", eTipoComestible.Solido); 
            Container ContenerdorUno = new Container(2, "Skanka"); 
            Container ContenerdorDos = new Container(3, "Skanka");
            ArrayList<Producto> listaProducto = new ArrayList<>();
            
            ContenerdorUno.agregar(ProductoUno);
            ContenerdorUno.agregar(ProductoDos);

            if(!ContenerdorUno.agregar(ProductoTres)) 
            {
                System.out.println("No se pudo");
            }
            
            ContenerdorDos.agregar(ProductoUno);
            ContenerdorDos.agregar(ProductoDos);
            if(!ContenerdorDos.agregar(ProductoCuatro)) 
            {
                System.out.println("No se pudo");
            }
            ContenerdorDos.agregar(ProductoTres);           
            System.out.println("________________________________");
            Container.mostrar(ContenerdorUno); 
            Container.mostrar(ContenerdorDos);

            listaProducto = Container.seleccionarComestible(ContenerdorDos,eTipoComestible.Liquido);
            
            System.out.println(" Lista Extraida "); 
            for(Producto item : listaProducto)
            {
                item.mostrar(); 
            } 


    }
    
}
