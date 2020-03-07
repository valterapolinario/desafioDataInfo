package desafiosefaz.bean;

import javax.faces.bean.ManagedBean;

import desafiosefaz.model.Usuario;
import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;
@ManagedBean
public class UsuarioBean {
	private Usuario usuario ;
	
	UsuarioRepositorio RU = new UsuarioRepositorioImpl();
 
	
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
