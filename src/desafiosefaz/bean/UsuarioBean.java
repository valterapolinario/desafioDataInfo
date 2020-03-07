package desafiosefaz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import desafiosefaz.model.Usuario;
import desafiosefaz.src.fachada.UsuarioFachada;
import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;
@ManagedBean
@SessionScoped
public class UsuarioBean {
	private Usuario usuario ;
	
	UsuarioFachada fachada = new UsuarioFachada();
 
	
	public Usuario getUsuario() {
		if(usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public void cadastrarUsuario() {
		fachada.cadastrarUsuario(usuario);
	}
	
	public List<Usuario>getUsuarios(){
		return fachada.listarUsuarios();
	}
	
	public String redirecionaCadastro() {
		return "cadastroUsuario.xhtml";
	}
	
	public String exluir(Usuario usuario) {
		fachada.removerUsuario(usuario.getId());
		return "tabelaUsuarios.xhtml";
	}

}
