package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

@Repository
public class SessaoDao {

	@PersistenceContext
	private EntityManager manager;
	
<<<<<<< HEAD
	public void save(Sessao sessao){
=======
	public void save(Sessao sessao) {
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		manager.persist(sessao);
	}
	
	public List<Sessao> buscaSessoesDaSala(Sala sala){
<<<<<<< HEAD
		return manager.createQuery("select s from Sessao s where s.sala = :sala", Sessao.class)
				.setParameter("sala", sala).getResultList();
=======
		return manager.createQuery("select s from Sessao s where s.sala = :sala", Sessao.class).setParameter("sala", sala).getResultList();
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	}
	
}
