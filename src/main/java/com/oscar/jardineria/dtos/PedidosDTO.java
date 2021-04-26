package com.oscar.jardineria.dtos;

public class PedidosDTO {
	
	public Integer idPedidos;
	public String fechaPedido;
	public String comentario;
	public String username;
	public PedidosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidosDTO(Integer idPedidos, String fechaPedido, String comentario, String username) {
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
