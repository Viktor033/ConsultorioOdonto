package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ extends logica.Persona_ {

	public static volatile SingularAttribute<Paciente, Boolean> tiene_OS;
	public static volatile SingularAttribute<Paciente, String> tipoSangre;
	public static volatile SingularAttribute<Paciente, Responsable> unResponnsable;
	public static volatile ListAttribute<Paciente, Turno> listaTurno;

	public static final String TIENE__OS = "tiene_OS";
	public static final String TIPO_SANGRE = "tipoSangre";
	public static final String UN_RESPONNSABLE = "unResponnsable";
	public static final String LISTA_TURNO = "listaTurno";

}

