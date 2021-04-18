package com.oscar.jardineria.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.oscar.jardineria.daos.UserDAO;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.repositorios.UserRepository;

import org.slf4j.Logger;

@RestController
@RequestMapping("/v1")
public class UsuarioController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDAO userDAO;
	
		
	// INSERTAR -----------------------------------------------------------------------
	
	@PostMapping(value ="/usuarios")
	public ResponseEntity<String> insertarUsuario(@RequestBody UserEntity usuario) {
		userRepository.save(usuario);
		return new ResponseEntity<>("Inserción de usuario correcta", HttpStatus.OK);
	}
	
	// LISTAR -----------------------------------------------------------------------

	
	@GetMapping(value= "/usuarios")
	public Iterable<UserEntity> listarUsuario() {
		return userRepository.findAll();
	}
	
	//Hacer por /usuarios/{id}, pasando por parametros eso
	@GetMapping(value = "/usuarios/{idUsuarios}")
	public Optional<UserEntity> listarUsuarioporID( @PathVariable("idUsuarios") Integer idUsuarios){
		return userRepository.findById(idUsuarios);
	}
	
	
	// ACTUALIZAR -----------------------------------------------------------------------
	@PutMapping(value="/usuarios")
	public ResponseEntity<String> actualizarUsuario( @RequestBody UserEntity user){
		userRepository.save(user);
		return new ResponseEntity<String> ("Actualización correcta de usuario", HttpStatus.OK);
	}
	
	
	
	// BORRAR -----------------------------------------------------------------------
	
	@DeleteMapping(value="/usuarios/{id}")
	public ResponseEntity<String> borrarUsuario (@PathVariable("id") Integer id){
		userRepository.deleteById(id);
		return new ResponseEntity<> ("Usuario borrado con exito", HttpStatus.OK);
	}
	
	
	

}
