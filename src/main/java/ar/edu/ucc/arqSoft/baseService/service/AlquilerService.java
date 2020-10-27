package ar.edu.ucc.arqSoft.baseService.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.baseService.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.baseService.dao.SocioDao;
import ar.edu.ucc.arqSoft.baseService.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.baseService.dto.PeliculaResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Alquiler;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;

@Service
@Transactional
public class AlquilerService {
	
	@Autowired
	private AlquilerDao alquilerDao;
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	@Autowired
	private SocioDao socioDao;
	
	public AlquilerResponseDto registrarAlquiler (AlquilerRequestDto dto) {
		
		Alquiler alquiler = new Alquiler();
		
		alquiler.setFechaAlquiler(Calendar.getInstance().getTime());
		alquiler.setPelicula(peliculaDao.load(dto.getPeliculaId()));
		alquiler.setSocio(socioDao.load(dto.getSocioId()));
		
		alquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = new AlquilerResponseDto();
		
		response.setApellido(alquiler.getSocio().getApellido());
		response.setTitulo(alquiler.getPelicula().getTitulo());
		response.setFecha(alquiler.getFechaAlquiler());
		response.setPelicula(alquiler.getPelicula());
		
		return response;
	}


	//public List<AlquilerResponseDto> getAllAlquileres() {
		
	//	return null;
	//}


	public AlquilerResponseDto getaAlquilerById(Long id) {
		Alquiler alquiler = alquilerDao.load(id);
		
		AlquilerResponseDto dto = new AlquilerResponseDto();
		dto.setTitulo(alquiler.getPelicula().getTitulo());
		String apellido = alquiler.getSocio().getApellido();
		String nombre = alquiler.getSocio().getNombre();
		String naSocio = nombre + apellido;
		dto.setApellido(naSocio);
		dto.setFecha(alquiler.getFechaAlquiler());
		return dto;
	}
	
public PeliculaResponseDto getPeliculaById (Long id) {
		
		Pelicula pelicula = peliculaDao.load(id);
		
		PeliculaResponseDto dto = new PeliculaResponseDto();
		dto.setNombre(pelicula.getTitulo());
		dto.setSinopsis(pelicula.getSinopsis());
		dto.setAnio(pelicula.getAnio());
		dto.setGenero(pelicula.getGenero().toString());
		dto.setVecesAlquilada((pelicula.getAlquileres()).size());
		return dto;	
		
	}
	

	
}
