package com.disney.api.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="audiovisuales")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Audiovisual implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAudiovisual;
	@Column
	private String imagen; 
	@Column
	private String titulo;
	@Column
	private String serieOpelicula;
	@Column
	private Date fechaCreacion;
	@Column
	@Size(min = 1, max = 5)
	private Integer calificacion;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "genero_id")
	private Genero genero;
		
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Personaje>personajes = new ArrayList<Personaje>();

	
}
