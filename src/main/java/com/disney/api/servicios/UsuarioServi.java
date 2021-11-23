package com.disney.api.servicios;

import org.springframework.stereotype.Service;

import com.disney.api.entidades.User;
import com.disney.api.repositorios.RepositorioBase;

@Service
public class UsuarioServi extends BaseServiImple<User, Long> {

	public UsuarioServi(RepositorioBase<User, Long> repositorioBase) {
		super(repositorioBase);
	}
	
	
	
}



