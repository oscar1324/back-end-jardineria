package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los presupuestos
 */

public class PresupuestosDTO {

		public Integer id_presupuestos;
		public String username;
		public Integer cantidad_terreno;
		public String fecha_presupuesto;
		public String comentario ;
		public Integer disabled;
		public Double precio;
		
		
		public PresupuestosDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PresupuestosDTO(Integer id_presupuestos, String username, Integer cantidad_terreno,
				String fecha_presupuesto, String comentario, Integer disabled, Double precio) {
			super();
			this.id_presupuestos = id_presupuestos;
			this.username = username;
			this.cantidad_terreno = cantidad_terreno;
			this.fecha_presupuesto = fecha_presupuesto;
			this.comentario = comentario;
			this.disabled = disabled;
			this.precio = precio;
		}


		public Integer getId_presupuestos() {
			return id_presupuestos;
		}


		public void setId_presupuestos(Integer id_presupuestos) {
			this.id_presupuestos = id_presupuestos;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public Integer getCantidad_terreno() {
			return cantidad_terreno;
		}


		public void setCantidad_terreno(Integer cantidad_terreno) {
			this.cantidad_terreno = cantidad_terreno;
		}


		public String getFecha_presupuesto() {
			return fecha_presupuesto;
		}


		public void setFecha_presupuesto(String fecha_presupuesto) {
			this.fecha_presupuesto = fecha_presupuesto;
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


		
}
