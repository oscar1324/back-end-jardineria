package com.oscar.jardineria.dtos;

import java.util.Date;

public class PresupuestosDTO {

		public int idPresupuestos;
		public int idUsuarios;
		public int cantidadTerreno;
		public int codigoPostal;
		public Date fechaPresupuesto;
		public int animales;
		public String comentario ;
		
		
		public PresupuestosDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PresupuestosDTO(int idPresupuestos, int idUsuarios, int cantidadTerreno, int codigoPostal,
				Date fechaPresupuesto, int animales, String comentario) {
			super();
			this.idPresupuestos = idPresupuestos;
			this.idUsuarios = idUsuarios;
			this.cantidadTerreno = cantidadTerreno;
			this.codigoPostal = codigoPostal;
			this.fechaPresupuesto = fechaPresupuesto;
			this.animales = animales;
			this.comentario = comentario;
		}


		public int getIdPresupuestos() {
			return idPresupuestos;
		}


		public void setIdPresupuestos(int idPresupuestos) {
			this.idPresupuestos = idPresupuestos;
		}


		public int getIdUsuarios() {
			return idUsuarios;
		}


		public void setIdUsuarios(int idUsuarios) {
			this.idUsuarios = idUsuarios;
		}


		public int getCantidadTerreno() {
			return cantidadTerreno;
		}


		public void setCantidadTerreno(int cantidadTerreno) {
			this.cantidadTerreno = cantidadTerreno;
		}


		public int getCodigoPostal() {
			return codigoPostal;
		}


		public void setCodigoPostal(int codigoPostal) {
			this.codigoPostal = codigoPostal;
		}


		public Date getFechaPresupuesto() {
			return fechaPresupuesto;
		}


		public void setFechaPresupuesto(Date fechaPresupuesto) {
			this.fechaPresupuesto = fechaPresupuesto;
		}


		public int getAnimales() {
			return animales;
		}


		public void setAnimales(int animales) {
			this.animales = animales;
		}


		public String getComentario() {
			return comentario;
		}


		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		
		
		
		
		
}
