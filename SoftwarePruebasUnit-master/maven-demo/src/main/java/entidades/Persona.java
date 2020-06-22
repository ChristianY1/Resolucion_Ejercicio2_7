package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity

public class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private String nombreCompleto;
	private String apellidosCompletos;
	private String numeroCedula;
	private String direccion;
	private String correo;
	private String contraseña;

	public Persona() {
		super();
	}

	public Persona(String nombreCompleto, String apellidosCompletos, String numeroCedula, String direccion,
			String correo, String contraseña) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.apellidosCompletos = apellidosCompletos;
		this.numeroCedula = numeroCedula;
		this.direccion = direccion;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellidosCompletos() {
		return apellidosCompletos;
	}

	public void setApellidosCompletos(String apellidosCompletos) {
		this.apellidosCompletos = apellidosCompletos;
	}

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombreCompleto=" + nombreCompleto + ", apellidosCompletos="
				+ apellidosCompletos + ", numeroCedula=" + numeroCedula + ", direccion=" + direccion + ", correo="
				+ correo + ", contraseña=" + contraseña + "]";
	}
	
	
	
	
   
}
