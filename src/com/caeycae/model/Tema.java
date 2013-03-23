package com.caeycae.model;

public class Tema {

	private String titulo;
	private Cantante cantante;
	private Double duracion;
	private Integer numero;
	
	public Tema(){}
	
	public Tema(String titulo, Cantante cantante, Double duracion,
			Integer numero) {
		super();
		this.titulo = titulo;
		this.cantante = cantante;
		this.duracion = duracion;
		this.numero = numero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
}
