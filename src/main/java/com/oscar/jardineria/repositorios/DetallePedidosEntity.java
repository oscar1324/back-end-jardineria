package com.oscar.jardineria.repositorios;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.oscar.jardineria.entities.PedidosEntity;
import com.oscar.jardineria.entities.ServiciosEntity;


@Entity
@Table( name = "detallePedido")
public class DetallePedidosEntity {
	
		
		@Id
		@Column(name ="idDetallePedido")
		private Integer idDetallePedido;
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
		@JoinColumn(name =" idPedidos")
		private PedidosEntity idPedidos;


		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
		@JoinColumn(name =" idServicio")
		private ServiciosEntity idServicio;



		public DetallePedidosEntity() {
			super();
			// TODO Auto-generated constructor stub
		}



		public DetallePedidosEntity(Integer idDetallePedido, PedidosEntity idPedidos, ServiciosEntity idServicio) {
			super();
			this.idDetallePedido = idDetallePedido;
			this.idPedidos = idPedidos;
			this.idServicio = idServicio;
		}



		public Integer getIdDetallePedido() {
			return idDetallePedido;
		}



		public void setIdDetallePedido(Integer idDetallePedido) {
			this.idDetallePedido = idDetallePedido;
		}



		public PedidosEntity getIdPedidos() {
			return idPedidos;
		}



		public void setIdPedidos(PedidosEntity idPedidos) {
			this.idPedidos = idPedidos;
		}



		public ServiciosEntity getIdServicio() {
			return idServicio;
		}



		public void setIdServicio(ServiciosEntity idServicio) {
			this.idServicio = idServicio;
		}
		
		


}
