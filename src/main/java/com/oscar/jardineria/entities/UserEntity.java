package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(name = "idUsuarios")
	private int idUsuarios;
	
	@Column(name = "dni")
	private int dni;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "FamNumerosa")
	private int famNumerosa;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private int password;
	
	public UserEntity(int idUsuarios) {
		super();
		this.idUsuarios = idUsuarios;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public UserEntity(int idUsuarios, int dni, String direccion, int telefono, String email, int famNumerosa,
			String usuario, int password) {
		super();
		this.idUsuarios = idUsuarios;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.famNumerosa = famNumerosa;
		this.usuario = usuario;
		this.password = password;
	}


	public UserEntity(Integer idusuarios2, Integer dni2, String direccion2, Integer telefono2, String email2,
			String usuario2, Integer password2) {
		this.idUsuarios = idusuarios2;
		this.dni = dni2;
		this.direccion = direccion2;
		this.telefono = telefono2;
		this.email = email2;
		this.usuario = usuario2;
		this.password = password2;
	}


	
	
}
