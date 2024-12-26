package logica;

import Persisrtencia.ControladoraPersistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPaciente(String dniPaciente,String nombre, String apellido
            ,String telefono, String direccion
            ,Responsable unResponsable, List listaTurno){
        
        try {
            Paciente pacien = new Paciente(dniPaciente, nombre, apellido, telefono,direccion);
            controlPersis.crearPaciente(pacien);
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
  

    
    
    
    
    
    
}
