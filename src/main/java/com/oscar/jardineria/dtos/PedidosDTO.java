package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los pedidos
 */

public class PedidosDTO {
	
	public Integer idPedidos;
	public String fechaPedido;
	public String username;
	public PedidosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidosDTO(Integer idPedidos, String fechaPedido, String username) {
		super();
		this.idPedidos = idPedidos;
		this.fechaPedido = fechaPedido;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

}
