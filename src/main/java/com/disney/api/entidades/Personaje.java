package com.disney.api.entidades;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personajes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Personaje implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonaje;
	@Column
	private String imagen;
	@Column
	private String nombre;
	@Column
	private Integer edad;
	@Column
	private Double peso;
	@Column
	private String historia; 
		
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="personaje_pelicula", joinColumns = {@JoinColumn(name="personaje_id")},inverseJoinColumns = {@JoinColumn(name="pelicula_id")})
	@JsonIgnoreProperties("personajes")
	private Set<Audiovisual>peliculas = new HashSet<Audiovisual>();

	
	
}
