package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
   // private int id_paciente;
    private boolean tiene_OS;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponnsable;
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurno;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSangre, Responsable unResponnsable, List<Turno> listaTurno, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSangre = tipoSangre;
        this.unResponnsable = unResponnsable;
        this.listaTurno = listaTurno;
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

   /* public int getId_paciente() {
        return id_paciente;
    }*/

   /* public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    
    
    
    
}
