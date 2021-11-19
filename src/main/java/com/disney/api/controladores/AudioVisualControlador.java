package com.disney.api.controladores;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.disney.api.entidades.Audiovisual;
import com.disney.api.servicios.AudioVisualServi;

@RestController
@RequestMapping(path = "api/v1/movies")
public class AudioVisualControlador extends ControladorBaseImpl<Audiovisual, AudioVisualServi>{
	
	@Autowired
	private AudioVisualServi audiovisualServi;
	
	
	@GetMapping("/filtrarNombre")
	public ResponseEntity<?> buscarPorNombre(@RequestParam String nombre) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(audiovisualServi.encontrarPorNombre(nombre));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}
	
	@GetMapping("/filtrarGenero")
	public ResponseEntity<?> buscarPorGenero(@RequestParam String genero) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(audiovisualServi.encontrarPorGenero(genero));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}
	
	@GetMapping("/filtrarFecha")
	public ResponseEntity<?> buscarPorFecha(@RequestParam Date fecha) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(audiovisualServi.findByFechaCreacion(fecha));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{error\":\"Error.\"}");
		}
	}

}
