package logica;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

// Definimos que la clase es una entidad de JPA
@Entity
public class Odontograma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación con Paciente
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    // Relación con Turnos o Consultas
    @OneToMany(mappedBy = "odontograma", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Turno> turnos;

    private String ultimaConsul;  // Última consulta registrada

    private String detalles;      // Campo para agregar información específica del odontograma

    public Odontograma() {}

    public Odontograma(Paciente paciente, String ultimaConsul, String detalles) {
        this.paciente = paciente;
        this.ultimaConsul = ultimaConsul;
        this.detalles = detalles;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getUltimaConsul() {
        return ultimaConsul;
    }

    public void setUltimaConsul(String ultimaConsul) {
        this.ultimaConsul = ultimaConsul;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}

