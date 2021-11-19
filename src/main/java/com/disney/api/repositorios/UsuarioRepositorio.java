package com.disney.api.repositorios;

import org.springframework.stereotype.Repository;

import com.disney.api.entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends RepositorioBase <Usuario, Long> {
	public void verificarCredenciales(Usuario usuario);
}
