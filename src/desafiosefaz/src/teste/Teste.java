package desafiosefaz.src.teste;

import desafiosefaz.bean.UsuarioBean;
import desafiosefaz.model.Telefone;
import desafiosefaz.model.Usuario;
import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;
import desafiosefaz.src.servico.UsuarioServico;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioServico bean = new UsuarioServico();
		Telefone telefone = new Telefone();
		
		  Usuario u = new Usuario (); 
		  
		 /* telefone.setDdd(81);
		  telefone.setNumero("996651727");
		  telefone.setTipo("celular");
		  u.setNome("lucas"); u.setEmail("unjg@gmail.com");
		  u.getTelefones().add(telefone);
		  bean.salvar(u);*/
		 

		/*
		 * List<Usuario>usuarios = new ArrayList<>(); usuarios = RU.buscarTodos(); for
		 * (Usuario usuario : usuarios) { System.out.println(usuario.getNome()); }
		 */

		/*
		 * Usuario usu = new Usuario(); usu.setId(1); usu.setNome("lucas");
		 * usu.setSenha("111"); RU.atualizar(usu);
		 */
		  u.getTelefones().add(null);
	}

}
