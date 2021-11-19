package com.disney.api.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.disney.api.entidades.Genero;
import com.disney.api.servicios.GeneroServi;

@RestController
@RequestMapping(path = "api/v1/genero")
public class GeneroControlador  extends ControladorBaseImpl<Genero, GeneroServi>{
	
}
