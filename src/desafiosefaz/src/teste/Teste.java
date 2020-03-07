package desafiosefaz.src.teste;

import desafiosefaz.src.repositorio.RepositorioUsuarioImplf;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioUsuarioImplf RU = new RepositorioUsuarioImplf();
		/*Usuario u = new Usuario ();
		u.setNome("lucas");
		u.setEmail("unjg@gmail.com");
		RU.salvar(u);*/
		
		
		/*List<Usuario>usuarios = new ArrayList<>();
		usuarios = RU.buscarTodos();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}*/
		
		
		/*Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("lucas");
		usu.setSenha("111");
		RU.atualizar(usu);*/
		
		RU.exluir(RU.buscarPorId(3));
	}

}
