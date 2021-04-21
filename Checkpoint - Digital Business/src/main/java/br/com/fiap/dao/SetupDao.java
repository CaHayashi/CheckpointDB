package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Setup;
import br.com.fiap.util.EntityManagerFacade;

public class SetupDao {

	EntityManager em = EntityManagerFacade.getEntityManager();
	
	//METODO CRIAR SETUPS
	public void criarSetups(Setup setup) {	
		em.getTransaction().begin();
		em.persist(setup);
		em.getTransaction().commit();
		
		em.close();
	}

	//METODO LISTAR SETUPS
	public List<Setup> listarSetups() {
		String jpql = "SELECT s FROM Setup s";
		TypedQuery<Setup> query = em.createQuery(jpql, Setup.class);
		return query.getResultList();
	}

}
