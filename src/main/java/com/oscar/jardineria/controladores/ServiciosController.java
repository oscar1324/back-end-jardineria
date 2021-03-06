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

import com.oscar.jardineria.entities.ServiciosEntity;
import com.oscar.jardineria.repositorios.ServiciosRepository;

@RestController
@CrossOrigin(origins ="*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/v1")
public class ServiciosController {
	
	@Autowired
	private ServiciosRepository serviciosRepository;
	
	
	// INSERTAR -----------------------------------------------------------------------
	
	@PostMapping(value = "/servicios")
	public ResponseEntity<String> insertarServicio( @RequestBody ServiciosEntity servicio){
		serviciosRepository.save(servicio);
		return new ResponseEntity<>("Inserción de servicio correcta", HttpStatus.OK);
	}
	// LISTAR -----------------------------------------------------------------------
	
	@GetMapping( value = "/servicios")
	public Iterable<ServiciosEntity> listarServicios (){
		return serviciosRepository.findAll();
	}
	
	@GetMapping( value = "/servicios/{id_servicios}")
	public Optional<ServiciosEntity> listarServicioporID (@PathVariable("id_servicios")Integer  id_servicios){
		return serviciosRepository.findById(id_servicios);
		
	}
	// ACTUALIZAR -----------------------------------------------------------------------
	// Echar vistazo
	@PutMapping(value="/servicios")
	public ResponseEntity<String> actualizarServicio( @RequestBody ServiciosEntity servicio){
		serviciosRepository.save(servicio);
		return new ResponseEntity<String> ("Actualización correcta de servicio", HttpStatus.OK);
	}
	
	// BORRAR -----------------------------------------------------------------------
	@DeleteMapping(value="/servicios/{id_servicios}")
	public ResponseEntity<String> borrarServicio (@PathVariable("id_servicios") Integer id_servicios){
		serviciosRepository.deleteById(id_servicios);
		return new ResponseEntity<> ("Servicio borrado con exito", HttpStatus.OK);
	}
}
