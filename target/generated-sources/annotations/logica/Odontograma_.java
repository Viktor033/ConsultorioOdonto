package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Odontograma.class)
public abstract class Odontograma_ {

	public static volatile SingularAttribute<Odontograma, Paciente> paciente;
	public static volatile ListAttribute<Odontograma, Turno> turnos;
	public static volatile SingularAttribute<Odontograma, String> detalles;
	public static volatile SingularAttribute<Odontograma, Long> id;
	public static volatile SingularAttribute<Odontograma, String> ultimaConsul;

	public static final String PACIENTE = "paciente";
	public static final String TURNOS = "turnos";
	public static final String DETALLES = "detalles";
	public static final String ID = "id";
	public static final String ULTIMA_CONSUL = "ultimaConsul";

}

