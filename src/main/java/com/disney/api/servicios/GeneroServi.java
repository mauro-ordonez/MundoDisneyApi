package com.disney.api.servicios;

import org.springframework.stereotype.Service;
import com.disney.api.entidades.Genero;
import com.disney.api.repositorios.RepositorioBase;

@Service
public class GeneroServi extends BaseServiImple<Genero, Long> {
	
	public GeneroServi(RepositorioBase<Genero, Long> repositorioBase) {
		super(repositorioBase);
	}
}