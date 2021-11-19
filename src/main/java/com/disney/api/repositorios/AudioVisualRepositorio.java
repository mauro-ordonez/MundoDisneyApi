package com.disney.api.repositorios;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.disney.api.entidades.Audiovisual;


@Repository
public interface AudioVisualRepositorio extends RepositorioBase<Audiovisual, Long>{
	
	@Query(value ="SELECT p FROM Audiovisual p WHERE p.titulo LIKE %:titulo%")
	List<Audiovisual> buscarPorNombre (@Param("titulo") String nombre); 
	@Query(value ="SELECT p FROM Audiovisual p WHERE p.genero LIKE %:genero%")
	List<Audiovisual> buscarPorGenero (@Param("genero") String genero); 
	List<Audiovisual> findByFechaCreacion (Date fechaCreacion);
}