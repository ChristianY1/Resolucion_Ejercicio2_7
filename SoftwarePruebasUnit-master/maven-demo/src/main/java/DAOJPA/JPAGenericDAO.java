package DAOJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAGenericDAO <T, ID> implements GenericDAO<T, ID>{
	
	private Class<T> persistentClass;
	protected EntityManager em;

	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("maven-demo").createEntityManager();
	}

	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("INGRESANDO: /n");
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
