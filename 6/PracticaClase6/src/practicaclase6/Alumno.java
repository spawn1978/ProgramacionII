/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase6;

/**
 *
 * @author gferrer_mecon
 */
public class Alumno
{
    private int _id;
    private String _apellidoNombre;
    private float _promedio;
    private int [] _notasIngreso;
    private String _direccion;
    private static final int CANTNOTAS = 3;

    //<editor-fold desc="CONSTRUCTORES">

        public Alumno()
        {

            this._notasIngreso=new int [CANTNOTAS];
            this.initNotas(_notasIngreso);        
        }

        public Alumno(int _id)
        {
            this();
            this._id=_id;
        }

        public Alumno(String _apellidoNombre, String _direccion)    
        {        
            this();
            this._apellidoNombre = _apellidoNombre;
            this._direccion = _direccion;
        }

        public Alumno(int id, String apellidoNombre, String direccion)
        {
            this(apellidoNombre,direccion);
        }
//</editor-fold>    
    //<editor-fold desc="GETTES">

        public int getId()
        {
            return _id;
        }

        public String getApellidoNombre()
        {
            return _apellidoNombre;
        }

        public float getPromedio()
        {
            return _promedio;
        }

        public int[] getNotasIngreso()
        {
            return _notasIngreso;
        }

        public String getDireccion()
        {
            return _direccion;
        }

        public static int getCANTNOTAS()
        {
            return CANTNOTAS;
        }
    //</editor-fold>    
    //<editor-fold desc="SETERS">
    
        public void setApellidoNombre(String _apellidoNombre)
        {
            this._apellidoNombre = _apellidoNombre;
        }

        public void setNotasIngreso(int[] _notasIngreso)
        {
            this._notasIngreso = _notasIngreso;
        }

        public void setDireccion(String _direccion)
        {
            this._direccion = _direccion;
        }
    //</editor-fold>
    
    private void initNotas( int [] vector)
    {
        for (int i = 0; i < vector.length; i++)
        {
            vector[i]=-1;            
        }
    }

        public void calcularPromedio()
        {
            int suma=0;
            for (int i : _notasIngreso)
            {
                suma=suma+i;
            }
            this._promedio=suma/CANTNOTAS;
        }
    
}
