package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajador")
@NamedQuery(name = "Trabajador.findAll", query = "SELECT r FROM Trabajador r")
public class Trabajador {

	@Id
	@Column(name = "codigoEmpleado")
	private int codigoEmpleado; 
	
	@Column(name = "nombre")
	private String nombre; 
	
	@Column(name = "apellidos")
	private String apellidos; 
	
	@Column(name = "dni")
	private String dni; 
	
	@Column(name = "estadoActividad")
	private boolean estadoActividad; 
	
	public Trabajador() {}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isEstadoActividad() {
		return estadoActividad;
	}

	public void setEstadoActividad(boolean estadoActividad) {
		this.estadoActividad = estadoActividad;
	}

	
	
	
	
}
