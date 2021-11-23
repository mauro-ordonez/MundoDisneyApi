package com.disney.api.repositorios;

import org.springframework.stereotype.Repository;

import com.disney.api.entidades.User;

@Repository
public interface UsuarioRepositorio extends RepositorioBase <User, Long> {
	
}
