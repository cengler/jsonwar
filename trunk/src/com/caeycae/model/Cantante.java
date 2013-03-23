package com.caeycae.model;

import java.util.Date;
import java.util.List;

public class Cantante {

	private String nombre;
	private Date fechaDeNacimiento;
	private List<Tema> temas;
	
	public Cantante(){}
	
	public Cantante(String nombre, Date fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public List<Tema> getTemas() {
		return temas;
	}
	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}
}
