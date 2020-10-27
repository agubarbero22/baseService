package ar.edu.ucc.arqSoft.baseService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.SocioDao;
import ar.edu.ucc.arqSoft.baseService.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Socio;

@Service
@Transactional
public class SocioService {
	
	
	@Autowired
	private SocioDao socioDao;
	
	
	public SocioResponseDto getSocioById (Long id) {
		
		Socio socio = socioDao.load(id);
		
		SocioResponseDto dto = new SocioResponseDto();
		dto.setNombre(socio.getNombre());
		dto.setApellido(socio.getApellido());
		
		return dto;	
		
	}
	
	
	public SocioResponseDto registrarSocio (SocioRequestDto dto) {
		
		Socio socio = new Socio();
		
		socioDao.insert(socio);
		
		SocioResponseDto response = new SocioResponseDto();
		
		response.setNombre(socio.getNombre());
		response.setApellido(socio.getApellido());
		
		return response;
		
	}

}
