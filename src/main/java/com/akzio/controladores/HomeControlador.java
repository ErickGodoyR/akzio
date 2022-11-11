package com.akzio.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akzio.repositorio.encuestaRepositorio;
import com.akzio.servicio.AlmacenServicio;
import com.akzio.modelo.encuesta;


@Controller
@RequestMapping("")
public class HomeControlador {
	
	@Autowired
	private encuestaRepositorio encuestaRepositorio;
	
	@Autowired
	private AlmacenServicio servicio;


	@GetMapping("")
	public ModelAndView verPaginaDeInicio() {
		//List<encuesta> encuesta = encuestaRepositorio.findAll();
		return new ModelAndView("index");
				      //.addObject("encuesta", encuesta);
	}

	
	@GetMapping("/respuestas")
	public ModelAndView listarRespuesta(@PageableDefault() Pageable pageable) {
		Page<encuesta> encuesta = encuestaRepositorio.findAll(pageable);
		return new ModelAndView("respuestas")
				        .addObject("encuesta",encuesta);
	}

	@GetMapping("/respuesta/{id}")
	public String delete(@PathVariable(name ="id") int id){
		servicio.delete(id);
		return "redirect:/";
	}
	
}
