package ar.edu.ucc.arqSoft.baseService.test.dao;

import java.util.logging.LogManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


import ar.edu.ucc.arqSoft.baseService.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.baseService.model.Pelicula;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class PeliculaDaoTest {
	
	
	@Autowired
	private PeliculaDao peliculaDao;


	@Test
	public void testFindById() {
		Pelicula pelicula = peliculaDao.load((long) 1);

		Assert.assertEquals("QUIROGA", pelicula.getTitulo().toUpperCase());
		return;
	}

}
