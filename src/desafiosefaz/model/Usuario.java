package desafiosefaz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.pl.REGON;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer id;
	@Column
	@NotNull(message = " informe um nome")
	private String nome;
	@Column
	@NotNull(message = "informe um email")
	@Email(message = "informe um email valido")
	private String email;
	@Column
	@NotNull(message = "informe a senha")
	private String senha;
	@Column
	@Range(min = 11,max = 99 ,message = " o ddd varia entre 11 e 99")
	private int ddd ;
	@Column
	@NotNull(message = "insira o numero de telefone")
	@Pattern(regexp = "(\\b[0-9]\\b)/g")
	private String numero;
	@Column
	@NotNull(message = "insira o tipo do telefone")
	private String tipo;

	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();

	public Usuario() {

	}



	public Usuario(Integer id, String nome, String email, String senha, int ddd, String numero, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}