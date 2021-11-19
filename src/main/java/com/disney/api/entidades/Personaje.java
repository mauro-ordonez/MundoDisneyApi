package com.disney.api.entidades;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
		
	@ManyToMany(mappedBy = "personajes")
	private List<Audiovisual> aparicionPeliculaSeire = new ArrayList<Audiovisual>();

	
	
}
