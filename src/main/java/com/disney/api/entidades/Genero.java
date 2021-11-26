package com.disney.api.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "genero")
	@JsonIgnoreProperties({"genero"})
	private List<Audiovisual>peliculas = new ArrayList<Audiovisual>();

	

}
