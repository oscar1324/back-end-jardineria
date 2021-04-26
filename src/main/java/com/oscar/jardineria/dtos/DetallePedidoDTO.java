package com.oscar.jardineria.dtos;

public class DetallePedidoDTO {
	
	public Integer idDetallePedido;
	public Integer idPedidos;
	public Integer idServicios;
	public DetallePedidoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePedidoDTO(Integer idDetallePedido, Integer idPedidos, Integer idServicios) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.idPedidos = idPedidos;
		this.idServicios = idServicios;
	}
	public Integer getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido(Integer idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}
	public Integer getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(Integer idPedidos) {
		this.idPedidos = idPedidos;
	}
	public Integer getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
	}

	

}
