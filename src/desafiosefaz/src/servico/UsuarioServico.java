package desafiosefaz.src.servico;

import java.util.List;

import desafiosefaz.model.Usuario;
import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;

public class UsuarioServico {
	private UsuarioRepositorio repositorio;

	public UsuarioServico() {
		this.repositorio = new UsuarioRepositorioImpl();
	}

	public void salvar(Usuario usuario) {
		this.repositorio.salvar(usuario);
	}

	public List<Usuario> listar() {
		return this.repositorio.buscarTodos();
	}

	public Usuario buscar(int id) {
		return this.repositorio.buscarPorId(id);
	}

	public void alterar(Usuario usuario) {
		this.repositorio.atualizar(usuario);
	}

	public void deletar(Usuario usuario) {
		this.repositorio.exluir(usuario);
	}

	public void deletarPorId(int id) {
		this.repositorio.exluirPorId(id);
	}

	public Usuario acessoLogin(String email, String senha) {
		return this.repositorio.VerificaAcesso(email, senha);

	}

	public boolean verificaAcessoLogin(String email, String senha) {
		if (acessoLogin(email, senha) == null) {
			return false;
		} else {
			return true;
		}
	}

}
