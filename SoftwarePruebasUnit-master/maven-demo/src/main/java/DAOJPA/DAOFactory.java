package DAOJPA;
import DAOJPA.JPADAOFatory;
public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFatory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PersonaDAO getPersonaDAO();

}
