package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los presupuestos
 */

public class PresupuestosDTO {

		public Integer idPresupuestos;
		public String username;
		public Integer cantidadTerreno;
		public String fechaPresupuesto;
		public String comentario ;
		public Integer disabled;
		public Double precio;
		public Integer idServicios;
		
		
		public PresupuestosDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PresupuestosDTO(Integer idPresupuestos, String username, Integer cantidadTerreno,
				String fechaPresupuesto, String comentario, Integer disabled, Double precio, Integer idServicios) {
			super();
			this.idPresupuestos = idPresupuestos;
			this.username = username;
			this.cantidadTerreno = cantidadTerreno;
			this.fechaPresupuesto = fechaPresupuesto;
			this.comentario = comentario;
			this.disabled = disabled;
			this.precio = precio;
			this.idServicios = idServicios;
		}


		public Integer getIdPresupuestos() {
			return idPresupuestos;
		}


		public void setIdPresupuestos(Integer idPresupuestos) {
			this.idPresupuestos = idPresupuestos;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public Integer getCantidadTerreno() {
			return cantidadTerreno;
		}


		public void setCantidadTerreno(Integer cantidadTerreno) {
			this.cantidadTerreno = cantidadTerreno;
		}


		public String getFechaPresupuesto() {
			return fechaPresupuesto;
		}


		public void setFechaPresupuesto(String fechaPresupuesto) {
			this.fechaPresupuesto = fechaPresupuesto;
		}


		public String getComentario() {
			return comentario;
		}


		public void setComentario(String comentario) {
			this.comentario = comentario;
		}


		public Integer getDisabled() {
			return disabled;
		}


		public void setDisabled(Integer disabled) {
			this.disabled = disabled;
		}


		public Double getPrecio() {
			return precio;
		}


		public void setPrecio(Double precio) {
			this.precio = precio;
		}


		public Integer getIdServicios() {
			return idServicios;
		}


		public void setIdServicios(Integer idServicios) {
			this.idServicios = idServicios;
		}


	
	
		
}
