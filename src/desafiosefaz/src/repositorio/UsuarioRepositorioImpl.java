package desafiosefaz.src.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import desafiosefaz.entity.manager.jpa.EntityManegerJPA;
import desafiosefaz.model.Usuario;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {
	EntityManager em = EntityManegerJPA.getEntityManager();

	@Override
	public void salvar(Usuario u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();

	}

	@Override
	public List<Usuario> buscarTodos() {
		String consulta = "FROM Usuario ";
		TypedQuery<Usuario> query = em.createQuery(consulta, Usuario.class);
		List<Usuario> resultado = query.getResultList();
		return resultado;
	}

	public Usuario buscarPorId(final int id) {
		Usuario usuario = em.find(Usuario.class, id);
		return usuario;

	}

	@Override
	public void atualizar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();

	}

	@Override
	public void exluir(Usuario usuario) {
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();

	}

	@Override
	public void exluirPorId(int idUsuario) {
		Usuario usuario = buscarPorId(idUsuario);
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();

	}
	public Usuario VerificaAcesso(String email, String senha) {
		try {
			Usuario usuario = (Usuario) em
					.createQuery("SELECT usuario from Usuario usuario where usuario.email= \r\n"
							+ "	             :email and usuario.senha = :senha")
					.setParameter("email", email).setParameter("senha", senha).getSingleResult();

			return usuario;
		} catch (NoResultException e) {
			return null;
		}

	}

}
