package com.disney.api.servicios;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.api.entidades.Personaje;
import com.disney.api.repositorios.PersonajeRepositorio;
import com.disney.api.repositorios.RepositorioBase;

import lombok.extern.slf4j.Slf4j;

@Service 
public class PersonajeServi extends BaseServiImple<Personaje ,Long> {

	@Autowired
	private PersonajeRepositorio personajeRepositorio;

	
	public PersonajeServi(RepositorioBase<Personaje, Long> repositorioBase) {
		super(repositorioBase);
		
	}

	
	@Transactional
    public List<Personaje> encontrarPorNombre(String nombre){
		try {
			return personajeRepositorio.buscarPorNombre(nombre);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
		
	@Transactional
    public List<Personaje>encontrarPorEdad(Integer edad){
		try {
			return personajeRepositorio.findByEdad(edad);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
	
	@Transactional
    public List<Personaje>encontrarPorPeso(Double peso){
		try {
			return personajeRepositorio.findByPeso(peso);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
}
