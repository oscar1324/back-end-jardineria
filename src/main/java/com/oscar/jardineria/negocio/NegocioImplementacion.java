package com.oscar.jardineria.negocio;

import org.springframework.beans.factory.annotation.Autowired;

import com.oscar.jardineria.daos.DescuentosDAO;
import com.oscar.jardineria.daos.PresupuestosDAO;
import com.oscar.jardineria.daos.UserDAO;


public class NegocioImplementacion implements INegocio{
	@Autowired
	private UserDAO userImpl;
	@Autowired
	private PresupuestosDAO presupuestosImpl;
	
	@Override
	public Double calcularTasa(String username, Integer id_presupuestos, Integer cantidad_terreno) {
		
		int cantidad = presupuestosImpl.obtenerPresupuestos2(id_presupuestos, username, cantidad_terreno );
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