package com.oscar.jardineria.dtos;

public class UserDTO {
	
	private int idUsuarios;
	private int dni;
	private String direccion;
	private int telefono;
	private String gmail;
	private int famNumerosa;
	private String usuario;
	private int password;
	
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserDTO(int idUsuarios, int dni, String direccion, int telefono, String gmail, int famNumerosa,
			String usuario, int password) {
		super();
		this.idUsuarios = idUsuarios;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.gmail = gmail;
		this.famNumerosa = famNumerosa;
		this.usuario = usuario;
		this.password = password;
	}
	
	public int getIdUsuarios() {
		return idUsuarios;
	}
	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getFamNumerosa() {
		return famNumerosa;
	}
	public void setFamNumerosa(int famNumerosa) {
		this.famNumerosa = famNumerosa;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	

}
