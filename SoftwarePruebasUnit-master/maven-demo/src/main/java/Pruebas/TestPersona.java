package Pruebas;

import DAOJPA.DAOFactory;
import DAOJPA.PersonaDAO;
import entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		PersonaDAO personaDAO = DAOFactory.getFactory().getPersonaDAO();
		
		Persona persona = new Persona("Alex", "Reinoso", "10005855","Macas","prueba@gmail.com","123");
		
		System.out.println("Creando persona: "+persona);
		personaDAO.create(persona);
		System.out.println("Persona Creada");

	}

}
