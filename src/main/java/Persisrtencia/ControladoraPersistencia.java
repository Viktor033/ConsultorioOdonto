package Persisrtencia;

import logica.Paciente;


public class ControladoraPersistencia {
    
    HorarioJpaController horaJPA = new HorarioJpaController ();
    HistorialMedicoJpaController historialJPA = new HistorialMedicoJpaController();
    OdontogramaJpaController odontograJPA = new OdontogramaJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();

    public void crearPaciente(Paciente pacien) throws Exception {
        pacienteJPA.create(pacien);
        
    }
    
    
}
