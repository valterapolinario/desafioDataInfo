package desafiosefaz.src.teste;

import desafiosefaz.src.repositorio.UsuarioRepositorio;
import desafiosefaz.src.repositorio.UsuarioRepositorioImpl;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioRepositorio RU = new UsuarioRepositorioImpl();
		/*
		 * Usuario u = new Usuario (); u.setNome("lucas"); u.setEmail("unjg@gmail.com");
		 * RU.salvar(u);
		 */

		/*
		 * List<Usuario>usuarios = new ArrayList<>(); usuarios = RU.buscarTodos(); for
		 * (Usuario usuario : usuarios) { System.out.println(usuario.getNome()); }
		 */

		/*
		 * Usuario usu = new Usuario(); usu.setId(1); usu.setNome("lucas");
		 * usu.setSenha("111"); RU.atualizar(usu);
		 */

		RU.exluir(RU.buscarPorId(4));
	}

}
