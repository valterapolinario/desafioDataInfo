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
		/*
		 * UsuarioServico bean = new UsuarioServico(); Telefone telefone = new
		 * Telefone();
		 * 
		 * Usuario u = new Usuario ();
		 */
		  
		  UsuarioRepositorioImpl UR = new UsuarioRepositorioImpl();
		  
		  
		 Usuario usu = UR.VerificaAcesso("wagner", "3347");
		  if(usu != null) {
			  System.out.println("PODE ACESSAR , TEM EMAIL E SENHA NO BANCO");
		  }else {
			  System.out.println("não tem acesso , retorno é null");
		  }
		  
		  
		  
		/*
		 * telefone.setDdd(81); telefone.setNumero("996651727");
		 * telefone.setTipo("celular"); u.setNome("lucas");
		 * u.setEmail("unjg@gmail.com"); telefone.setUsuario(u);
		 * u.getTelefones().add(telefone); bean.salvar(u);
		 */
		 

		/*
		 * List<Usuario>usuarios = new ArrayList<>(); usuarios = RU.buscarTodos(); for
		 * (Usuario usuario : usuarios) { System.out.println(usuario.getNome()); }
		 */

		/*
		 * Usuario usu = new Usuario(); usu.setId(1); usu.setNome("lucas");
		 * usu.setSenha("111"); RU.atualizar(usu);
		 */
		//  u.getTelefones().add(null);
	}

}
