package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
    @Id
    private String dniPaciente;
    @OneToOne
    private Responsable unResponnsable;
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurno;

    public Paciente(String dniPaciente1, String nombre, String apellido) {
    }

    public Paciente(String dniPaciente, Responsable unResponnsable, List<Turno> listaTurno) {
        this.dniPaciente = dniPaciente;
        this.unResponnsable = unResponnsable;
        this.listaTurno = listaTurno;
    }

    Paciente(String dniPaciente, String nombre, String apellido, String telefono, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Gethther  & Setther

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public Responsable getUnResponnsable() {
        return unResponnsable;
    }

    public void setUnResponnsable(Responsable unResponnsable) {
        this.unResponnsable = unResponnsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }
    
    
    
}