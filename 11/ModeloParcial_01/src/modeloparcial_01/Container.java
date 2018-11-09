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
public class Container
{
    //<editor-fold desc="ATRIBUTOS">
        private int _capacidad;
        private String _empresa;
        private ArrayList <Producto> _listaProductos;        
    //</editor-fold>
        
    //<editor-fold desc="CONSTRUCTOR">
        public Container (int _capacidad, String _empresa)
        {
            this._listaProductos = new ArrayList<>();
            this._capacidad = _capacidad;
            this._empresa = _empresa;            
        }
    //</editor-fold>        
        
    //<editor-fold desc="METODOS">
        

        public boolean agregar(Producto proUno)
        {//7) Crear el método de instancia Agregar (Producto) que agregue a la lista de productos del
        //contenedor el producto pasado por parámetro sólo si la capacidad lo permite y el producto no se encuentra ya en la lista.
            boolean retorno=false;
            if(this._capacidad > this._listaProductos.size())
            {              
               if( !Container.contieneProducto(this, proUno)) 
               {
                   this._listaProductos.add(proUno);
               }                
            }
            return retorno;
        }
        public static void mostrar(Container contenedor)
        {//4) Crear un método de clase Mostrar (Container) que muestre los datos del contenedor pasado 
         //por parámetro. Se deberá mostrar también la lista completa de sus productos.
            
            StringBuilder cadena=new StringBuilder();            
            cadena.append("Empresa: ").append(contenedor._empresa);
            cadena.append("\nCapacidad: ").append(contenedor._capacidad);            
            cadena.append("\n ------- Productos -------");
            System.out.println(cadena.toString());
            
            for (Producto unProducto : contenedor._listaProductos)
            {
                unProducto.mostrar();
            }
            System.out.println("==================================");
        }
                                   
        public static ArrayList<Producto> seleccionarComestible (Container contenedorUno, eTipoComestible tipo)
        {//6) El método SeleccionarComestible retornara una lista con todos los productos que pertenecen al tipo indicado.
            ArrayList <Producto> retorna_Lista;
            retorna_Lista= new ArrayList<>();
            
            for (Producto unProdDeLista : contenedorUno._listaProductos)
            {
                if (unProdDeLista.comparaComestible(unProdDeLista, tipo) == true )
                {
                    retorna_Lista.add(unProdDeLista);                    
                }
            }
            return retorna_Lista;
        }
        
        public static boolean contieneProducto(Container unContenedor,Producto unProducto)
        {//5) El método ContieneProducto que devuelve verdadero sólo si el producto se encuentra en la lista.            
            
            boolean retorno=false;
            for (Producto unProdDeLista : unContenedor._listaProductos)
            {
                if (Producto.comparaDosProductos(unProdDeLista, unProducto))
                {
                    retorno=true;
                    break;
                }
            }
            return retorno;
        }
    //</editor-fold>
        
}
