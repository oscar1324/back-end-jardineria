package com.oscar.jardineria.dtos;

public class DetallePedidoDTO {
	
	public int idDetallePedido;
	public int idPedidos;
	public int idServicios;
	public DetallePedidoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePedidoDTO(int idDetallePedido, int idPedidos, int idServicios) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.idPedidos = idPedidos;
		this.idServicios = idServicios;
	}
	public int getIdDetallePedido() {
		return idDetallePedido;
	}
	public void setIdDetallePedido(int idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public int getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(int idServicios) {
		this.idServicios = idServicios;
	}
	
	

}
