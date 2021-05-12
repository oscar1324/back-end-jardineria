package com.oscar.jardineria.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.entities.UserEntity;
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
	
	// INSERTAR -----------------------------------------------------------------------
	// REVISAR
	@PostMapping(value ="/presupuestos")
	public ResponseEntity<String> insertarPrespuestos(@RequestBody PresupuestosDTO presupuestos) {
		PresupuestosEntity pe = new PresupuestosEntity(
				presupuestos.getId_presupuestos(),
				new UserEntity(presupuestos.getUsername(), null, null),
				presupuestos.getCantidad_terreno(),
				presupuestos.getFecha_presupuesto(),
				presupuestos.getComentario(),
				presupuestos.getDisabled());
		
		presupuestosRepository.save(pe);
		return new ResponseEntity<>("Inserción de prespuesto correcta", HttpStatus.OK);
	}
	// LISTAR -----------------------------------------------------------------------
	@GetMapping(value= "/presupuestos")
	public Iterable<PresupuestosEntity> listarUsuario() {
		return presupuestosRepository.findAll();
	}
	
	@GetMapping(value = "/presupuestos/{id_presupuestos}")
	public Optional<PresupuestosEntity> listarUsuarioporID( @PathVariable("id_presupuestos") Integer id_presupuestos){
		return presupuestosRepository.findById(id_presupuestos);
	}
	// ACTUALIZAR -----------------------------------------------------------------------
	
	// REVISAR
	@PutMapping(value="/presupuestos")
	public ResponseEntity<String> actualizarUsuario( @RequestBody PresupuestosEntity presupuestos){
	//	presupuestosRepository.save(presupuestos);
		return new ResponseEntity<String> ("Actualización presupuestos de usuario", HttpStatus.OK);
	}
	
	
	// BORRAR -----------------------------------------------------------------------
	// -- No se puede borrar po rque tiene que ver username
	@DeleteMapping(value="/presupuestos/{id_presupuestos}")
	public ResponseEntity<String> borrarPresupuesto (@PathVariable("id_presupuestos") Integer id_presupuestos){
		presupuestosRepository.deleteById(id_presupuestos);
		return new ResponseEntity<> ("Presupuesto borrado con exito", HttpStatus.OK);
	}
	
}
