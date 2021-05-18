package com.oscar.jardineria.negocio;

import org.springframework.beans.factory.annotation.Autowired;

import com.oscar.jardineria.daos.PresupuestosDAO;


public class NegocioImplementacion implements INegocio{

	@Autowired
	private PresupuestosDAO presupuestosImpl;
	
	@Override
	public Double calcularPrecio(Integer cantidadTerreno, double precio ) {
		// ¿Obtengo la cantidad de terreno pero como sabe de que id?
		double cantidad = presupuestosImpl.obtenerCantidadTerreno( cantidadTerreno); // Sería obtener cantidad
		double precioTotal = presupuestosImpl.obtenerPrecio(precio);
		// ¿Es correcto este método para guardarlo?
	
		if((cantidad <= 50 )) {
			precioTotal = cantidad * 0.05;
		} else if((cantidad >= 50) && (cantidad <= 150)) {
			precioTotal  = cantidad * 0.10;
			
		} else if((cantidad >= 150) && (cantidad <= 300)){
			precioTotal  = cantidad * 0.15;
		} else{
			precioTotal  = cantidad * 0.20;
			return null;
		}
		return precioTotal;
	}
}