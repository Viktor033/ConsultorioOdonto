package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Odontologo.class)
public abstract class Odontologo_ extends logica.Persona_ {

	public static volatile SingularAttribute<Odontologo, Usuario> unUsuario;
	public static volatile ListAttribute<Odontologo, Turno> listaTurno;
	public static volatile SingularAttribute<Odontologo, String> especialidad;
	public static volatile SingularAttribute<Odontologo, Horario> unHorario;

	public static final String UN_USUARIO = "unUsuario";
	public static final String LISTA_TURNO = "listaTurno";
	public static final String ESPECIALIDAD = "especialidad";
	public static final String UN_HORARIO = "unHorario";

}

