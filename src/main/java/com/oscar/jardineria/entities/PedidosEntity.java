package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Óscar Izquierdo
 * Entidad de la tabla pedidos de la base de datos jardineriasl
 */

@Entity
@Table(name = "pedidos")
public class PedidosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedidos")
	private Integer id_pedidos;
	
	@Column(name = "fecha_pedido")
	private String fecha_pedido;
	
	@Column(name = "username") // Relacionar con username table
	private String username;

	public PedidosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedidosEntity(Integer id_pedidos, String fecha_pedido, String username) {
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
