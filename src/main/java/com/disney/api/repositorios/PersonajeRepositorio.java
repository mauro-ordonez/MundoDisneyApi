package com.disney.api.repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.disney.api.entidades.Personaje;

@Repository
public interface PersonajeRepositorio extends RepositorioBase <Personaje, Long>{
	
	@Query(value ="SELECT p FROM Personaje p WHERE p.nombre LIKE %:nombre%")
	List<Personaje> buscarPorNombre (@Param("nombre") String nombre); 
	List<Personaje> findByEdad(@Param("edad") Integer edad);
	List<Personaje> findByPeso(@Param("peso") Double peso);
}