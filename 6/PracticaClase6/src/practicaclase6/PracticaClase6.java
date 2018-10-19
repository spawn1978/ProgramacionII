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
public class PracticaClase6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Alumno unAlumno = new Alumno(1,"Perez Juan","la quiaca 123");       
        
        unAlumno.setNotasIngreso(Genericas.cargarVectorInt(3));       
        unAlumno.calcularPromedio();
        System.out.println(unAlumno.alumnoAString());
        
        Alumno [] vectorAlumnos=new Alumno [2];
        
        
    }
    
}
