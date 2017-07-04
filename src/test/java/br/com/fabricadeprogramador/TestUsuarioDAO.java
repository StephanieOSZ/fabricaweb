package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testAlterar();
	}
	
	public static void testCadastrar() {
		
		// Criando o usuário
		Usuario usu = new Usuario();
		usu.setNome("Felipe");
		usu.setLogin("ff");
		usu.setSenha("123");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
		
	}
	
	public static void testAlterar() {
		
		// Criando o usuário
		Usuario usu = new Usuario();
		usu.setId(6);
		usu.setNome("Felipe Santos");
		usu.setLogin("ffs");
		usu.setSenha("123");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
		
	}
	
	public static void testDelete() {
		
		// Criando o usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.delete(usu);
		
		System.out.println("Deletado com sucesso!");
		
	}

}
