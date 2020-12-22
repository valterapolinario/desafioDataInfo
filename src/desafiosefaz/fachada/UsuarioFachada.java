package desafiosefaz.fachada;

import java.time.LocalDate;
import java.util.List;

import desafiosefaz.model.Usuario;
import desafiosefaz.servico.UsuarioServico;

public class UsuarioFachada {

	private static UsuarioServico usuarioServicoInstancia;

	public UsuarioFachada() {
		this.usuarioServicoInstancia = new UsuarioServico();
	}
	// implementação de singleton na fachada
	public static UsuarioServico getServicoInstancia() {
		if (usuarioServicoInstancia == null) {
			usuarioServicoInstancia = new UsuarioServico();
		}
		return usuarioServicoInstancia;
	}

	public void cadastrarUsuario(Usuario usuario) {
		
		usuarioServicoInstancia.salvar(usuario);
	}

	public List<Usuario> listarUsuarios() {
		return usuarioServicoInstancia.listar();
	}

	public Usuario buscarUsuario(int id) {
		return usuarioServicoInstancia.buscar(id);
	}

	public void atualizarUsuario(Usuario usuario) {
		usuarioServicoInstancia.alterar(usuario);
	}

	public void removerUsuario(int id) {
		usuarioServicoInstancia.deletarPorId(id);
	}

	public boolean verificaUsuarioLogin(String email, String senha) {
		return usuarioServicoInstancia.verificaAcessoLogin(email, senha);
	}
}
