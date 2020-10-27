package ar.edu.ucc.arqSoft.baseService.dao;
/*
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
*/
import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Pelicula;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;

@Repository
public class PeliculaImpDao extends GenericDaoImp<Pelicula, Long> implements PeliculaDao {
 
/*	@Override
	public List<Pelicula> findById(Long id) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Pelicula> criteria = builder.createQuery(Pelicula.class);
		Root<Pelicula> entity = criteria.from(Pelicula.class);
		
		criteria.select(entity).where(builder.equal(entity.get("titulo"), id));
		return em.createQuery(criteria).getResultList();
	}
*/


}
