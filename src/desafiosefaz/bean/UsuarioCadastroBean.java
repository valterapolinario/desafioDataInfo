package desafiosefaz.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.model.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioCadastroBean {

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

	public String cadastrarUsuario() {
		try {
			fachada.cadastrarUsuario(usuario);
			FacesContext contexto = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Cadastrado com sucesso",
					"sucesso");
			contexto.addMessage(null, msg);
			return null;
		} catch (Exception e) {
			FacesContext contexto = FacesContext.getCurrentInstance();
			FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!" + e.getMessage(), "");
			contexto.addMessage(null, mensagem);
			return null;
		}

	}

}