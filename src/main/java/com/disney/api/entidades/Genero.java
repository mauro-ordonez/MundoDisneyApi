package com.disney.api.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "generos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Genero implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGenero;
	@Column
	private String imagen;
	@Column
	private String nombre;

	//@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL , orphanRemoval = true)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(name ="genero_audiovisual", joinColumns = @JoinColumn(name="genero_id"), 
	inverseJoinColumns = @JoinColumn(name ="audiovisual_id" ))
	private List<Audiovisual>peliculaSerieAsociadas;

	

}
