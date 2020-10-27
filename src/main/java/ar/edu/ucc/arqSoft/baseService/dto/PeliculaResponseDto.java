package ar.edu.ucc.arqSoft.baseService.dto;

public class PeliculaResponseDto {
	
	private String nombre;
	
	private String sinopsis;
	
	private String anio;
	
	private String genero;
	
	private Integer vecesAlquilada;
	
	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getVecesAlquilada() {
		return vecesAlquilada;
	}

	public void setVecesAlquilada(Integer vecesAlquilada) {
		this.vecesAlquilada = vecesAlquilada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
