/**
 * 
 */
package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * @author Usuario
 *
 */

@Entity
@Table(name = "detallepedido")  
public class DetallePedidosEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detallepedidos") 
	private Integer id_detallepedidos;
	
	@JoinColumn(name = "id_servicios") 
	private String id_servicios;
	
	@JoinColumn(name = "id_pedidos") 
	private String id_pedidos;

	public DetallePedidosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetallePedidosEntity(Integer id_detallepedidos, String id_servicios, String id_pedidos) {
		super();
		this.id_detallepedidos = id_detallepedidos;
		this.id_servicios = id_servicios;
		this.id_pedidos = id_pedidos;
	}

	public Integer getId_detallepedidos() {
		return id_detallepedidos;
	}

	public void setId_detallepedidos(Integer id_detallepedidos) {
		this.id_detallepedidos = id_detallepedidos;
	}

	public String getId_servicios() {
		return id_servicios;
	}

	public void setId_servicios(String id_servicios) {
		this.id_servicios = id_servicios;
	}

	public String getId_pedidos() {
		return id_pedidos;
	}

	public void setId_pedidos(String id_pedidos) {
		this.id_pedidos = id_pedidos;
	}



	
	
}
