package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class PedidosEntity {
	
	@Id
	@Column(name = "idPedidos")
	private Integer idPedidos;
	
	@Column(name = "fechaPedido")
	private String fechaPedido;
	
	@Column(name = "comentario")
	private String comentario;
	
	@Column(name = "username") // Relacionar con username table
	private String username;

	public PedidosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedidosEntity(Integer idPedidos, String fechaPedido, String comentario, String username) {
		super();
		this.idPedidos = idPedidos;
		this.fechaPedido = fechaPedido;
		this.comentario = comentario;
		this.username = username;
	}

	public Integer getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	

}
