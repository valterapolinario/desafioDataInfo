package desafiosefaz.model;

import javax.persistence.EntityManager;

import desafiosefaz.entity.manager.jpa.EntityManegerJPA;

public class RepositorioUsuario {
	EntityManager em = EntityManegerJPA.getEntityManager();
	public void cadastrarUsuario(Usuario u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}

}
