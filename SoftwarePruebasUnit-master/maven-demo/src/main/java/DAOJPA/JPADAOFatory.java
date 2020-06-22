package DAOJPA;

public class JPADAOFatory extends DAOFactory{

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return new JPAPersonaDAO();
	}

}
