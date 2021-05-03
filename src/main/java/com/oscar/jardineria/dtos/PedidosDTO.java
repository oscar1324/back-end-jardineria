package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los pedidos
 */

public class PedidosDTO {
	
	public Integer id_pedidos;
	public String fecha_pedido;
	public String username;
	public PedidosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidosDTO(Integer id_pedidos, String fecha_pedido, String username) {
		super();
		this.id_pedidos = id_pedidos;
		this.fecha_pedido = fecha_pedido;
		this.username = username;
	}
	public Integer getId_pedidos() {
		return id_pedidos;
	}
	public void setId_pedidos(Integer id_pedidos) {
		this.id_pedidos = id_pedidos;
	}
	public String getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	

}
