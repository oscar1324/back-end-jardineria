package com.oscar.jardineria.dtos;
/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los usuarios
 */

public class UserDTO {
	
	private String username;
	private String password;
	private int disabled;


	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserDTO(String username, String password, int disabled) {
		super();
		this.username = username;
		this.password = password;
		this.disabled = disabled;
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



	public int getDisabled() {
		return disabled;
	}



	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	



	
	
}