package com.disney.api.controladores;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.api.entidades.Usuario;
import com.disney.api.servicios.UsuarioServi;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioControlador extends ControladorBaseImpl<Usuario, UsuarioServi> {

}
