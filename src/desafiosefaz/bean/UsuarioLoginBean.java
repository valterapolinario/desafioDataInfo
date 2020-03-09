package desafiosefaz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.model.Usuario;
import desafiosefaz.repositorio.UsuarioRepositorio;
import desafiosefaz.repositorio.UsuarioRepositorioImpl;

@ManagedBean
@SessionScoped
public class UsuarioLoginBean {
	private Usuario usuario;

	UsuarioFachada fachada = new UsuarioFachada();

	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	public String Login() {
		boolean logado = fachada.verificaUsuarioLogin(usuario.getEmail(), usuario.getSenha());

		if (logado == true) {
			System.out.println("logado com sucesso");
			return "tabelaUsuarios";
		} else {
			System.out.println("login não encontrado");
			return "cadastro usuario";
		}
	}
}
