package desafiosefaz.bean;

import javax.faces.bean.ManagedBean;

import desafiosefaz.model.Usuario;
import desafiosefaz.src.repositorio.RepositorioUsuarioImplf;
@ManagedBean
public class UsuarioBean {
	private Usuario usuario ;
	
	RepositorioUsuarioImplf RU = new RepositorioUsuarioImplf();
 
	
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
		RU.salvar(usuario);
	}

}
