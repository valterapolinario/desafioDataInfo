package desafiosefaz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import desafiosefaz.model.Usuario;
import desafiosefaz.src.fachada.UsuarioFachada;
import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;

@ManagedBean
@SessionScoped
public class UsuarioListarBean {
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

	public List<Usuario> getUsuarios() {
		return fachada.listarUsuarios();
	}

	public String exluir(Usuario usuario) {
		fachada.removerUsuario(usuario.getId());
		return "tabelaUsuarios.xhtml";
	}
	public String alterar(Usuario obj) {
		this.usuario = obj;
		return "atualizaUsuario.xhtml";
	}
	public String redirecionaCadastro() {
		return "cadastroUsuario.xhtml";
	}

}
