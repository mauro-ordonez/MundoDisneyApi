package com.disney.api.servicios;

import org.springframework.stereotype.Service;

import com.disney.api.entidades.Usuario;
import com.disney.api.repositorios.RepositorioBase;

@Service
public class UsuarioServi extends BaseServiImple<Usuario, Long> {

	public UsuarioServi(RepositorioBase<Usuario, Long> repositorioBase) {
		super(repositorioBase);
	}
}
