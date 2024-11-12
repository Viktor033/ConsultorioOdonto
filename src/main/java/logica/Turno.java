
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turno;
    @Temporal(TemporalType.DATE)
    private Date fecha_Turno;
    private String hora_Turno;
    private String afeccion;
    @ManyToOne
    @JoinColumn(name="id_turno")
    private Odontologo odonto;
    @ManyToOne
    @JoinColumn(name="id_turno2")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int id_turno, Date fecha_Turno, String hora_Turno, String afeccion) {
        this.id_turno = id_turno;
        this.fecha_Turno = fecha_Turno;
        this.hora_Turno = hora_Turno;
        this.afeccion = afeccion;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_Turno() {
        return fecha_Turno;
    }

    public void setFecha_Turno(Date fecha_Turno) {
        this.fecha_Turno = fecha_Turno;
    }

    public String getHora_Turno() {
        return hora_Turno;
    }

    public void setHora_Turno(String hora_Turno) {
        this.hora_Turno = hora_Turno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
    
    
    
}
