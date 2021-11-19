package com.disney.api.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.api.entidades.Usuario;
import com.disney.api.servicios.UsuarioServi;

@RestController
@RequestMapping(path = "api/v1/usiario")
public class AutenControlador {
	
	@Autowired
	private UsuarioServi usuarioServi; 
	
	@PostMapping("/login")
	public void login(@RequestBody Usuario usuario) {
		usuarioServi.save(usuario);
	}

}
