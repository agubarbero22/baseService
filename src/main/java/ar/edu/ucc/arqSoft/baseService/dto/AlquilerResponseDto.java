package ar.edu.ucc.arqSoft.baseService.dto;

import java.util.Date;

import ar.edu.ucc.arqSoft.baseService.model.Pelicula;

public class AlquilerResponseDto {
	
	private Date fecha;
	
	private String apellido;
	
	private String titulo;
	
	private Pelicula pelicula;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	

}
