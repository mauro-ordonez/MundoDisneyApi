package com.disney.api.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disney.api.Utils.JWTUtil;
import com.disney.api.entidades.Personaje;
import com.disney.api.servicios.PersonajeServi;


@RestController
@RequestMapping(path = "api/v1/characters")
public class PersonajeControlador extends ControladorBaseImpl<Personaje, PersonajeServi>{

	@Autowired
	private PersonajeServi personajeServi;	
	
	@Autowired
	private JWTUtil jwtUtilM;
	
	@GetMapping("/filtrarNombre")
	public ResponseEntity<?> buscarPorNombre(@RequestParam String nombre) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeServi.encontrarPorNombre(nombre));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}
	
	@GetMapping("/filtrarEdad")
	public ResponseEntity<?> buscarPorEdad(@RequestParam Integer edad) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeServi.encontrarPorEdad(edad));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}
	
	@GetMapping("/filtrarPeso")
	public ResponseEntity<?> buscarPorPeso(@RequestParam Double peso) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeServi.encontrarPorPeso(peso));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}	
}
