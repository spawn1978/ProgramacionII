/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase6;

import java.text.DecimalFormat;



/**
 *
 * @author gferrer_mecon
 */
public class Alumno
{
    private static int _secuencia = 0;
    private static final int CANTNOTAS = 3;
    
    private int _id;
    private String _apellidoNombre;
    private String _direccion;
    private int [] _notasIngreso;
    private float _promedio;

    //<editor-fold desc="CONSTRUCTORES">

        public Alumno()
        {
            this.getNextId();
            this._notasIngreso=new int [CANTNOTAS];
            this.initNotas(_notasIngreso);        
        }

        public Alumno(String _apellidoNombre)
        {
            this();
            this._apellidoNombre= _apellidoNombre;
        }

        public Alumno(String _apellidoNombre, String _direccion)    
        {        
            this(_apellidoNombre);            
            this._direccion = _direccion;
        }

        public Alumno(int id, String apellidoNombre, String direccion)
        {
            this(apellidoNombre,direccion);
            this._id=id;
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
    //<editor-fold desc="METODOS">

        private int getNextId()
        {
            _secuencia++;
            return _secuencia;
        }
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
            int cuentanotas=0;
            for (int i : _notasIngreso)
            {
                if (suma!=-1)
                {
                    suma=suma+i;    
                    cuentanotas++;
                }                    
            }
            this._promedio=(float) suma/cuentanotas;
        }
            
        public String alumnoAString()
        {
            /*
            return "id: " + this._id
                    + " | apellido y nombre : " + this._apellidoNombre
                    + " | direccion: " + this._direccion
                    + " | nota 1: " + this._notasIngreso[0]
                    + " | nota 2: " + this._notasIngreso[1]
                    + " | nota 3: " + this._notasIngreso[2]
                    + " | promedio: " + new DecimalFormat("#,##0.00").format(this.getPromedio());
            */
            StringBuilder cadena=new StringBuilder();
            cadena.append(this._id);
            cadena.append("#");
            cadena.append(this._apellidoNombre);
            cadena.append("#");
            cadena.append(this._direccion);
            cadena.append("#");
            cadena.append(this.getNotasIngreso()[0]);
            cadena.append("#");
            cadena.append(this.getNotasIngreso()[1]);
            cadena.append("#");
            cadena.append(this.getNotasIngreso()[2]);
            cadena.append("#");
            cadena.append( new DecimalFormat("#,##0.00").format(this.getPromedio()) );
            return cadena.toString();
        }    
        //</editor-fold>
            
}
