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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.oscar.jardineria.daos.UserDAO;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.repositorios.UserRepository;

import org.slf4j.Logger;

@Controller
public class UsuarioController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDAO userDAO;
	
	
	// INSERTAR -----------------------------------------------------------------------
	
//	@GetMapping(value ="insertarUsuario")
//	public ResponseEntity<String> insertarUsuario(@RequestBody UserEntity usuario) {
//		userRepository.save(usuario);
//		return new ResponseEntity<>("Inserción de usuario correcta", HttpStatus.OK);
//	}
//	
	// LISTAR -----------------------------------------------------------------------

	
	@GetMapping(value= "/usuarios")
	public Iterable<UserEntity> listarUsuario() {
		return userRepository.findAll();
	}
	
	// Hacer por /usuarios/{id}, pasando por parametros eso
	
	
	// ACTUALIZAR -----------------------------------------------------------------------
	// BORRAR -----------------------------------------------------------------------
	
//	@DeleteMapping(value="/usuarios/{id}")
//	public ResponseEntity<String> borrarUsuario (@PathVariable("id") Integer id){
//		userRepository.deleteById(id);
//		return new ResponseEntity<> ("Borrado con exito", HttpStatus.OK);
//	}
//	
	
	
//	@PostMapping(value = "insertarUsuario")
//	public String InsertarUsuario(
//			@RequestParam(value = "id", required = false) Integer id, 
//			@RequestParam(value = "dni", required = false) Integer dni,
//			@RequestParam(value = "direccion", required = false) String direccion,
//			@RequestParam(value = "telefono", required = false) Integer telefono,
//			@RequestParam(value = "email", required = false) String email,
//			@RequestParam(value = "usuario") String usuario, 
//			@RequestParam(value = "password") Integer password,
//			@RequestParam(value = "familiaNumerosa", required = false) Integer familiaNumerosa, 
//			ModelMap model){
//		
//		
//		
//
//		
//		return "vistas/alumnos/insertarAlumnos";	
//		
//	}
}
