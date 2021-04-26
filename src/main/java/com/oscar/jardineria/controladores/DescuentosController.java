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

import com.oscar.jardineria.entities.DescuentosEntity;
import com.oscar.jardineria.repositorios.DescuentosRepository;

/**
 * @author Óscar Izquierdo
 * Controller de los descuentos
 */

@RestController
@RequestMapping("/v4")
public class DescuentosController {

	@Autowired
	private DescuentosRepository descuentosRepository;
	
	// INSERTAR -----------------------------------------------------------------------
	
	@PostMapping(value = "/descuentos") // ojo con Iterable
	public ResponseEntity<String> insertarDescuentos (@RequestBody DescuentosEntity descuentos){
		descuentosRepository.save(descuentos);
		return new ResponseEntity<>("Inserción de descuento correcta", HttpStatus.OK);
	}
	// LISTAR -----------------------------------------------------------------------
	@GetMapping(value = "/descuentos")
	private Iterable<DescuentosEntity> listarDescuentos(){
		return descuentosRepository.findAll();
	}
	
	@GetMapping(value = "/descuentos/{idDescuentos}")
	public Optional<DescuentosEntity> listarDescuentosporID( @PathVariable("idDescuentos") Integer idDescuentos){
		return descuentosRepository.findById(idDescuentos);
	}
	// ACTUALIZAR -----------------------------------------------------------------------
	@PutMapping(value = "/descuentos")
	public ResponseEntity<String> actualizarDescuentos( @RequestBody DescuentosEntity descuentos){
		return new ResponseEntity<String>("Actualización de descuento correcto" , HttpStatus.OK);
	}
	
	// RESVISARLO
	@PutMapping(value = "/descuentos/{idDescuentos}")
	public ResponseEntity<String> actualizarDescuentos( @RequestBody DescuentosEntity descuentos, 
														@PathVariable("idDescuentos") Integer idDescuentos){
		return new ResponseEntity<String>("Actualización de descuento correcto" , HttpStatus.OK);
	}
	
	
	// BORRAR -----------------------------------------------------------------------
	@DeleteMapping(value="/descuentos/{idDescuentos}")
	public ResponseEntity<String> borrarUsuario (@PathVariable("idDescuentos") Integer idDescuentos){
		descuentosRepository.deleteById(idDescuentos);
		return new ResponseEntity<> ("Descuento borrado con exito", HttpStatus.OK);
	}
	
}
