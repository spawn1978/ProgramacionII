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
public class Turno
{
    private int _orden;
    private Paciente _paciente;
    private eTipo _tipo;
    static private int _seqUrgente;
    static private int _seqNormal;

    //<editor-fold desc="constructor">
        static
        {
            _seqUrgente=0;
            _seqNormal=0;
        }
        
        public Turno()
        {
        }

        public Turno(int _orden, Paciente _paciente, eTipo _tipo)
        {
            this._orden = _orden;
            this._paciente = _paciente;
            this._tipo = _tipo;
        }
    //</editor-fold>    
    //<editor-fold desc="GETTERS-SETTERS">
        public int getOrden()
        {
            return _orden;
        }

        public void setOrden(int _orden)
        {
            this._orden = _orden;
        }

        public Paciente getPaciente()
        {
            return _paciente;
        }

        public void setPaciente(Paciente _paciente)
        {
            this._paciente = _paciente;
        }

        public eTipo getTipo()
        {
            return _tipo;
        }

        public void setTipo(eTipo _tipo)
        {
            this._tipo = _tipo;
        }
    //</editor-fold>
    
    //<editor-fold desc="METODOS">
        private static int asignarTurno(eTipo tipo)
        {
            int retorno =-1;
            switch(tipo)
            {
                case URGENTE:
                    _seqUrgente ++;
                    retorno=_seqUrgente;
                    break;
                case NORMAL:
                    _seqNormal ++;
                    retorno=_seqNormal;
                    break;                
            }
            return retorno;
        }
    //</editor-fold>
}
