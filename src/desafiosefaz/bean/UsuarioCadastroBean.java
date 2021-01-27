package desafiosefaz.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.model.Telefone;
import desafiosefaz.model.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioCadastroBean {

	private Usuario usuario;
	private Telefone telefone;
	private List<Telefone> telefones = new ArrayList<>();

	UsuarioFachada fachada = new UsuarioFachada();

	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public Telefone getTelefone() {
		if (telefone == null) {
			telefone = new Telefone();
		}
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String cadastrarUsuario() {
		try {
			telefone.setUsuario(usuario);
			telefones.add(telefone);
			usuario.setTelefones(telefones);
			fachada.cadastrarUsuario(usuario);
			usuario = null;
			FacesContext contexto = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Cadastrado com sucesso",
					"sucesso");
			contexto.addMessage(null, msg);

			
			return "tabelaUsuarios.xhtml";
		} catch (Exception e) {
			FacesContext contexto = FacesContext.getCurrentInstance();
			FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!" + e.getMessage(), "");
			contexto.addMessage(null, mensagem);
			return null;
		}

	}

}