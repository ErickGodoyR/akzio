package com.akzio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akzio.modelo.encuesta;
import com.akzio.repositorio.encuestaRepositorio;

@Service
public class AlmacenServicioImpl implements AlmacenServicio{

	@Autowired
	encuestaRepositorio encuestaRepositorio;
	
	@Override
	public void create(encuesta e) {
		encuestaRepositorio.save(e);
		
	}

	@Override
	public List<encuesta> read() {
		return encuestaRepositorio.findAll();
	}

	@Override
	public encuesta read(int id) {
		return encuestaRepositorio.findById(id).orElse(new encuesta());
	}

	@Override
	public void update(encuesta e) {
		encuestaRepositorio.save(e);
		
	}

	@Override
	public void delete(int id) {
		encuestaRepositorio.deleteById(id);
	}

	@Override
	public encuesta guardarEncuesta(encuesta encuesta) {
		return encuestaRepositorio.save(encuesta);
	}
}
