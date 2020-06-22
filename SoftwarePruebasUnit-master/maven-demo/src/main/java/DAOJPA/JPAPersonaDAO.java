package DAOJPA;
import javax.persistence.Persistence;

import entidades.*;
public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO{
	public JPAPersonaDAO() {
		super(Persona.class);
		this.em = Persistence.createEntityManagerFactory("maven-demo").createEntityManager();
	}
	
}
