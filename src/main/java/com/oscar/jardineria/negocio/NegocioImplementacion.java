package com.oscar.jardineria.negocio;

import org.springframework.beans.factory.annotation.Autowired;

import com.oscar.jardineria.daos.PresupuestosDAO;


public class NegocioImplementacion implements INegocio{

	@Autowired
	private PresupuestosDAO presupuestosImpl;
	
	@Override
	public Double calcularTasa(Integer cantidad_terreno, Integer id_presupuestos) {
		double cantidad = presupuestosImpl.obtenerPresupuestos2(id_presupuestos, cantidad_terreno); // Sería obtener cantidad
		//int descuento = descuentosImpl.obtenerDescuentosSolo(descuento); --- CONSULTAR
		//int precio = desc
		if((cantidad <= 50 )) {
			// precio (cantidad tabla descuento)) precio = precio * 0.05
		} else if((cantidad >= 50) && (cantidad <= 150)) {
			// precio  = precio * 0.10
			// precio, posiblemente crear en tabla de presupuestos bbdd y no me lio con descuentos
		} else if((cantidad >= 150) && (cantidad <= 300)){
			// precio  = precio * 0.15
		} else{
			// precio  = precio * 0.20
			return null;
		}
		return null;
	}
}