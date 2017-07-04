package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usu) {
		
		String sql = "insert into usuario(nome,login,senha)values(?,?,?)";	

		try 
		{
			//Criando o statment
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1,usu.getNome());
			preparador.setString(2,usu.getLogin());
			preparador.setString(3,usu.getSenha());
			
			//Executando o comando no banco
			preparador.execute();
			
			//fechando o objeto preparador
			preparador.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alterar(Usuario usu) {
		String sql = "update usuario set nome = ?, login = ?, senha = ? where id = ?";	

		try 
		{
			//Criando o statment
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1,usu.getNome());
			preparador.setString(2,usu.getLogin());
			preparador.setString(3,usu.getSenha());
			preparador.setLong(4,usu.getId());
			
			//Executando o comando no banco
			preparador.execute();
			
			//fechando o objeto preparador
			preparador.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Usuario usu) {
		String sql = "delete from usuario where id = ?";	

		try 
		{
			//Criando o statment
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setLong(1,usu.getId());
			
			//Executando o comando no banco
			preparador.execute();
			
			//fechando o objeto preparador
			preparador.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
