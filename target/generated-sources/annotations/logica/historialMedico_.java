package logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistorialMedico.class)
public abstract class HistorialMedico_ {

	public static volatile SingularAttribute<HistorialMedico, Date> fecha_registro;
	public static volatile SingularAttribute<HistorialMedico, String> diagnostico;
	public static volatile SingularAttribute<HistorialMedico, String> notas_adicionales;
	public static volatile SingularAttribute<HistorialMedico, Paciente> paciente;
	public static volatile SingularAttribute<HistorialMedico, Long> id;
	public static volatile SingularAttribute<HistorialMedico, String> medicamentos;
	public static volatile SingularAttribute<HistorialMedico, String> tratamiento;

	public static final String FECHA_REGISTRO = "fecha_registro";
	public static final String DIAGNOSTICO = "diagnostico";
	public static final String NOTAS_ADICIONALES = "notas_adicionales";
	public static final String PACIENTE = "paciente";
	public static final String ID = "id";
	public static final String MEDICAMENTOS = "medicamentos";
	public static final String TRATAMIENTO = "tratamiento";

}

