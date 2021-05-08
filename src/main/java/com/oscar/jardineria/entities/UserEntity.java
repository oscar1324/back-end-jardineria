package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Óscar Izquierdo
 * Entidad de la tabla users de la base de datos jardineriasl
 */

@Entity
@Table(name = "users")  // Retocar
public class UserEntity {
	// Retocar todo

	@Id 
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column (name = "disabled")
	private Integer disabled;
	
	public UserEntity() {
		super();
	}

	public UserEntity(String username, String password, Integer disabled) {
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

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}


	

	
}
