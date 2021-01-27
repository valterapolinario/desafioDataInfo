package desafiosefaz.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.model.Usuario;

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
			return "tabelaUsuarios";
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"e-mail e/ou senha invalidos", null));
			return null;
		}
	}
}
