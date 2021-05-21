package com.oscar.jardineria.negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.PresupuestosDAO;
import com.oscar.jardineria.dtos.PresupuestoCalculadoDTO;
import com.oscar.jardineria.dtos.SolicitudPresupuestoDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.entities.ServiciosEntity;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.repositorios.PresupuestosRepository;
import com.oscar.jardineria.repositorios.ServiciosRepository;

@Service
public class NegocioImplementacion implements INegocio{


	@Autowired
	private PresupuestosDAO presupuestosImpl;
	@Autowired
	private ServiciosRepository serviciosRepository;
	@Autowired
	private PresupuestosRepository presupuestosRepository;
	
	@Override
	public Double calcularPrecio(Integer cantidadTerreno, double precio ) {
		double cantidad = presupuestosImpl.obtenerCantidadTerreno( cantidadTerreno); // Sería obtener cantidad
		double precioTotal = presupuestosImpl.obtenerPrecio(precio);
	
		if((cantidad <= 50 )) {
			precioTotal = cantidad * 5.05;
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

	@Override
	public PresupuestoCalculadoDTO calcularPresupuesto(SolicitudPresupuestoDTO solicitudPresupuesto) {
		
		ServiciosEntity servicio = serviciosRepository.findById(solicitudPresupuesto.getServicio()).orElse(null);
		
		double precioServicio = servicio.getPrecioMetro();
		if(( solicitudPresupuesto.getTerreno() == 50 )) {
			precioServicio = servicio.getPrecioMetro() * 3.95;
		} else if((solicitudPresupuesto.getTerreno() >= 50) && (solicitudPresupuesto.getTerreno() <= 150)) {
			precioServicio  = servicio.getPrecioMetro()  * 2.90;
			
		} else if((solicitudPresupuesto.getTerreno() >= 150) ){
			precioServicio  = servicio.getPrecioMetro()  * 1.85;
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String hoy = df.format(new Date());
		PresupuestosEntity p = new PresupuestosEntity (null, 
								new UserEntity(solicitudPresupuesto.getUser(), null, null),
								solicitudPresupuesto.getTerreno(),
								hoy,
								new ServiciosEntity(solicitudPresupuesto.getServicio(), null, null),
								solicitudPresupuesto.getComentario(),
								1,precioServicio);
		presupuestosRepository.save(p);
		return new PresupuestoCalculadoDTO(precioServicio);
	}
}