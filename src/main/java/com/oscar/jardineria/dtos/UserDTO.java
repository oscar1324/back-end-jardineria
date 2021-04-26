package com.oscar.jardineria.dtos;
/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los usuarios
 */

public class UserDTO {
	
	private String username;
	private String password;
	private int enabled;
	private String nombre;
	private String apellido;
	private String direccion;
	
	
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserDTO(String username, String password, int enabled, String nombre, String apellido, String direccion) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getEnabled() {
		return enabled;
	}



	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	
	
}