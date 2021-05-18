package com.oscar.jardineria.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.jardineria.dtos.PresupuestoCalculadoDTO;
import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.dtos.SolicitudPresupuestoDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.negocio.INegocio;
import com.oscar.jardineria.repositorios.PresupuestosRepository;

/**
 * @author Óscar Izquierdo
 * Controller de los presupuestos
 */

@RestController
@CrossOrigin(origins ="*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/v1")
public class PresupuestosController {
	
	@Autowired
	private PresupuestosRepository presupuestosRepository;
	
	@Autowired
	private INegocio negocio;
	
	// INSERTAR -----------------------------------------------------------------------
	@PostMapping(value ="/presupuestos")
	public ResponseEntity<String> insertarPrespuestos(@RequestBody PresupuestosDTO presupuestos) {
		PresupuestosEntity pe = new PresupuestosEntity(
				presupuestos.getIdPresupuestos(),
				new UserEntity(presupuestos.getUsername(), null, null),
				presupuestos.getCantidadTerreno(),
				presupuestos.getFechaPresupuesto(),
				presupuestos.getComentario(),
				presupuestos.getDisabled(),
				presupuestos.getPrecio());
		
		presupuestosRepository.save(pe);
		return new ResponseEntity<>("Inserción de prespuesto correcta", HttpStatus.OK);
	}
	
	@PostMapping(value ="/solicitudpresupuesto")
	public double solicitudPrespuesto(@RequestBody SolicitudPresupuestoDTO solicitudPresupuesto) {
		negocio.calcularPresupuesto(solicitudPresupuesto);
		return negocio.calcularPresupuesto(solicitudPresupuesto).getPresupuesto();
	}
	
	// LISTAR -----------------------------------------------------------------------
	@GetMapping(value= "/presupuestos")
	public Iterable<PresupuestosEntity> listarPresupuesto() {
		return presupuestosRepository.findAll();
	}
	
	
	
	@GetMapping(value = "/presupuestos/{id_presupuestos}")
	public Optional<PresupuestosEntity> listarPresupuestoporID( @PathVariable("id_presupuestos") Integer id_presupuestos){
		return presupuestosRepository.findById(id_presupuestos);
	}
	// ACTUALIZAR -----------------------------------------------------------------------
	
	@PutMapping(value="/presupuestos")
	public ResponseEntity<String> actualizarPresupuesto( @RequestBody PresupuestosEntity presupuestos){
	//	presupuestosRepository.save(presupuestos);
		return new ResponseEntity<String> ("Actualización presupuestos de usuario", HttpStatus.OK);
	}
	
	
	
	// BORRAR -----------------------------------------------------------------------
	@DeleteMapping(value="/presupuestos/{id_presupuestos}")
	public ResponseEntity<String> borrarPresupuesto (@PathVariable("id_presupuestos") Integer id_presupuestos){
		presupuestosRepository.deleteById(id_presupuestos);
		return new ResponseEntity<> ("Presupuesto borrado con exito", HttpStatus.OK);
	}
	
}
