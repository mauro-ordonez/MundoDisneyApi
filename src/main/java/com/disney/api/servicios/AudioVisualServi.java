package com.disney.api.servicios;


import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.api.entidades.Audiovisual;
import com.disney.api.repositorios.AudioVisualRepositorio;
import com.disney.api.repositorios.RepositorioBase;

@Service
public class AudioVisualServi extends BaseServiImple<Audiovisual , Long>{
	
	
	@Autowired
	private AudioVisualRepositorio audiovisualRepositorio;
	
	public AudioVisualServi(RepositorioBase<Audiovisual, Long> repositorioBase) {
		super(repositorioBase);
	}

	
	@Transactional
    public List<Audiovisual> encontrarPorNombre(String nombre){
		try {
			return audiovisualRepositorio.buscarPorNombre(nombre);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
	
	@Transactional
    public List<Audiovisual> encontrarPorGenero(String genero){
		try {
			return audiovisualRepositorio.buscarPorGenero(genero);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
	
	@Transactional
    public List<Audiovisual> findByFechaCreacion(Date fechaCreacion){
		try {
			return audiovisualRepositorio.findByFechaCreacion(fechaCreacion);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}	
	}
	
}
