/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author gferrer_mecon
 */
public class Paciente
{
    private String _DNI;
    private String _Nombre;

    public Paciente()
    {
    }

    public Paciente(String _DNI, String _Nombre)
    {
        this._DNI = _DNI;
        this._Nombre = _Nombre;
    }

    public String getDNI()
    {
        return _DNI;
    }

    public void setDNI(String _DNI)
    {
        this._DNI = _DNI;
    }

    public String getNombre()
    {
        return _Nombre;
    }

    public void setNombre(String _Nombre)
    {
        this._Nombre = _Nombre;
    }
    
    
}
