package desafiosefaz.bean;

import javax.faces.bean.ManagedBean;

import desafiosefaz.model.RepositorioUsuario;
import desafiosefaz.model.Usuario;
@ManagedBean
public class UsuarioBean {
	private Usuario usuario ;
	
	RepositorioUsuario RU = new RepositorioUsuario();
 
	
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
		RU.cadastrarUsuario(usuario);
	}

}
