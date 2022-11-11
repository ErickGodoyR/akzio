package com.akzio.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akzio.modelo.encuesta;

@Service
public interface AlmacenServicio {

	public void create(encuesta e);
    public List<encuesta> read();
    public encuesta read(int id);
    public void update(encuesta e);
    public void delete(int id);
    
    public encuesta guardarEncuesta(encuesta encuesta);
}
