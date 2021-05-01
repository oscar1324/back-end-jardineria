package com.oscar.jardineria.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.repositorios.PresupuestosRepository;

/**
 * @author Óscar Izquierdo
 * Controller de los presupuestos
 */

@RestController
@RequestMapping("/v1")
public class PresupuestosController {
	
	@Autowired
	private PresupuestosRepository presupuestosRepository;
	
	// INSERTAR -----------------------------------------------------------------------
	// REVISAR
	@PostMapping(value ="/presupuestos")
	public ResponseEntity<String> insertarPrespuestos(@RequestBody PresupuestosEntity prespuestos) {
		presupuestosRepository.save(prespuestos);
		return new ResponseEntity<>("Inserción de prespuesto correcta", HttpStatus.OK);
	}
	// LISTAR -----------------------------------------------------------------------
	// Lista mal , coge la id dupilcada creada por el mismo, para ver cotenido debes insertar información por los campos ducplicados
	@GetMapping(value= "/presupuestos")
	public Iterable<PresupuestosEntity> listarUsuario() {
		return presupuestosRepository.findAll();
	}
	
	@GetMapping(value = "/presupuestos/{idPresupuestos}")
	public Optional<PresupuestosEntity> listarUsuarioporID( @PathVariable("idPresupuestos") Integer idPresupuestos){
		return presupuestosRepository.findById(idPresupuestos);
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
	@DeleteMapping(value="/presupuestos/{idPresupuestos}")
	public ResponseEntity<String> borrarUsuario (@PathVariable("idPresupuestos") Integer idPresupuestos){
		presupuestosRepository.deleteById(idPresupuestos);
		return new ResponseEntity<> ("Usuario borrado con exito", HttpStatus.OK);
	}
	
}
