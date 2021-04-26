package com.oscar.jardineria.dtos;

public class PresupuestosDTO {

		public Integer idPresupuestos;
		public String username;
		public Integer cantidadTerreno;
		public String fechaPresupuesto;
		public String comentario ;
		
		
		public PresupuestosDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PresupuestosDTO(Integer idPresupuestos, String username, Integer cantidadTerreno,
				String fechaPresupuesto, String comentario) {
			super();
			this.idPresupuestos = idPresupuestos;
			this.username = username;
			this.cantidadTerreno = cantidadTerreno;
			this.fechaPresupuesto = fechaPresupuesto;
			this.comentario = comentario;
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

	
}
