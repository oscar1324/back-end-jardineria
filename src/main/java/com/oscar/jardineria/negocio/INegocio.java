package com.oscar.jardineria.negocio;

import com.oscar.jardineria.dtos.PresupuestoCalculadoDTO;
import com.oscar.jardineria.dtos.SolicitudPresupuestoDTO;

public interface INegocio {
	Double calcularPrecio( Integer cantidad_terreno, double precio );
	
	PresupuestoCalculadoDTO calcularPresupuesto(SolicitudPresupuestoDTO solicitudPresupuesto) ;

}
