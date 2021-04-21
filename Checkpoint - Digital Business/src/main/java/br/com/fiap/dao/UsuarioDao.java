package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Usuario;
import br.com.fiap.util.EntityManagerFacade;

public class UsuarioDao {
	EntityManager em = EntityManagerFacade.getEntityManager();
		
	//METODO CREATE PARA USUARIO
	public void criarUsuario(Usuario user) {		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
		em.close();
	}

	//METODO SELECT QUE RETORNA A LISTA DE USUARIOS CADASTRADOS
	public List<Usuario> listarUsuarios(){
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		return query.getResultList();
	}
}
