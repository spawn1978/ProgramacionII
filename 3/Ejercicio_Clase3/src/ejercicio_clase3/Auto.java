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
public class Auto
{
    //<editor-fold desc="Teoria clases">
        //composicion o agregacion compuesta... es cuando una clase agrega a otra clase.
        //Agregacion (Rombo)=>  y el tiempo de vida no es coincidente... si se destruye un objeto el otro puede seguir existiendo
        //composicion (Rombo lleno)=> no puede seguir existiendo  (sin ruedas no existe auto)
        //Asociacion (auto y chofer) => relacion entre 2 clases que no indica herencia ni agregacion

        //Auto es clase dependiente de rueda    
    //</editor-fold>
    //<editor-fold desc="Atributos">
    private eFabricante _fabricante;
    private Rueda _ruedadd;
    private Rueda _ruedadi;
    private Rueda _ruedatd;
    private Rueda _ruedati;
    public static int contador;
    private int kilometrosRecorridos;
    //</editor-fold>
    
    //<editor-fold desc="constructor">
    public Auto()
    {
        //this._fabricante=eFabricante.FIAT;
        int MarcaRandom=(int) ( Math.random()* eFabricante.values().length );        
        this._fabricante=eFabricante.values( ) [MarcaRandom];
        
        this._ruedadd=new Rueda();
        this._ruedadi=new Rueda();
        this._ruedatd=new Rueda();
        this._ruedati=new Rueda();
        contador++;
    }
    
    static 
    {//esto se ejecuta antes de inicializarse un objeto de la clase Auto
        contador=0;
    }

    //</editor-fold>
    
    
    //<editor-fold desc="getters">
    public eFabricante getFabricante()
    {
        return this._fabricante;
    }

    public int getKilometrosRecorridos()
    {
        return this.kilometrosRecorridos;
    }
    
    
    //</editor-fold >

    //<editor-fold desc="setters">
    public void setKilometrosRecorridos(int kilometrosRecorridos)
    {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    //</editor-fold>
    
    //<editor-fold desc="Metodos">
    
    public void VolverACero()
    {
        this.kilometrosRecorridos = 0;
    }
    
    public void MostrarCarrera()
    {
        System.out.println(this.getFabricante() + " Km: " + this.getKilometrosRecorridos()  );
    }
    
    public void saludo()
    {
        //this._fabricante=eFabricante.FIAT;
        System.out.println("Hola " + this.getFabricante());
        System.out.println("Contador: " + contador);

    }
    //</editor-fold>

    
}
