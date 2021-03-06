package desafiosefaz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.model.Telefone;
import desafiosefaz.model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioAtualizaBean {
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

	public String atualizarUsuario() {
		fachada.cadastrarUsuario(usuario);
		return "tabelaUsuarios.xhtml";
	}

	public String redirecionaCadastro() {
		return "cadastroUsuario.xhtml";
	}

	public String alterar(Usuario obj, List<Telefone>telefones) {
		this.usuario = obj;
		this.usuario.setTelefones(telefones);
		return "atualizaUsuario.xhtml";
	}
	

}
