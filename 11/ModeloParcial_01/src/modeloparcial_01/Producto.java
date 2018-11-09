/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial_01;

/**
 *
 * @author gferrer_mecon
 */
public class Producto
{
    private int _codigoBarras;
    private String _nombre;
    private double _precio;
    private eTipoComestible _tipo;

    //<editor-fold desc="Constructor">
        public Producto(int codigo)
        {
            this._codigoBarras = codigo;
        }
        public Producto(int codigo, String nombre, eTipoComestible tipo)
        {
            this(codigo);
            this._nombre = nombre;            
            this._tipo = tipo;
        }
        public Producto(int codigo, String nombre, eTipoComestible tipo, double precio)
        {
            this(codigo,  nombre,  tipo);
            this._precio = precio;
        }
    //</editor-fold>
    
    //<editor-fold desc="METODOS">
        public void mostrar()
        {
            StringBuilder cadena=new StringBuilder();
            cadena.append(" Codigo de Barra: ").append(this._codigoBarras);
            cadena.append(" Nombre: ").append(this._nombre);
            cadena.append(" Tipo: ").append(this._tipo);
            cadena.append(" Precio: ").append(this._precio);
            System.out.println(cadena.toString());   
        }        
        public boolean comparaComestible(Producto unProducto, eTipoComestible tipo)
        {//b) El método comparaComestible devuelve verdadero sólo si el producto pertenece al tipo de comestible con el que se compara
//            boolean retorno=false;
//            if(unProducto._tipo == tipo)
//            {
//                retorno=true;                
//            }
//            return retorno;
            return unProducto._tipo == tipo;
        }
        public static boolean comparaDosProductos(Producto unProducto, Producto otroProducto)
        { //a) El método comparaDosProductos permite comparar dos productos y devuelva verdadero sólo cuando estos sean iguales
//            boolean retorno=false;
//            if(unProducto._codigoBarras == otroProducto._codigoBarras)
//            {
//                retorno=true;                
//            }
//            return retorno;
              return unProducto._codigoBarras == otroProducto._codigoBarras;
        }
    //</editor-fold>
}
