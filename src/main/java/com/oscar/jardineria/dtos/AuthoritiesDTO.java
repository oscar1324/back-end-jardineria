package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de la autenticación
 */

public class AuthoritiesDTO {
	
	public String username;
	public String authority;
	public AuthoritiesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthoritiesDTO(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
