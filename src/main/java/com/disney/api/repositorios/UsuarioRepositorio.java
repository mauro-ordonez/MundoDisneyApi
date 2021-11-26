package com.disney.api.repositorios;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.disney.api.entidades.Usuario;


@Repository("gestorUsuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable> {
	
	public abstract Usuario findByUsuario(String usuario);

}
