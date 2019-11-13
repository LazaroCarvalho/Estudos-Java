// Classe que efetua conexão ao banco de dados [SGBD MySQL/MariaDB]

/****************************************
 * Atividade Tela de Cadastro de Alunos *
 *                                      *
 * Nada a fazer nesta classe            *
 ****************************************/

package org.com.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	private static Connection con = null;
	
	public static Connection getConexao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
										// Ipv4 servidor BD/Banco de dados [db_aluno] 
			String dbUrl = "jdbc:mysql://10.107.140.55/db_aluno?useTimezone=false&serverTimezone=UTC&useSSL=false";
			
			// Usuário e senha [Adminstrador do banco de dados "db_aluno"
			String user = "aluno";
            String pass = "aluno";
            
            con = DriverManager.getConnection(dbUrl, user, pass);
            // JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso.");   
		} catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Oops! Ocorreu um erro na conexão!");
            erro.printStackTrace();
        }         
        return con;
    }
	
	public static void fecharConexao() {
	    if (con != null) {
	        try {
	            con.close();
	        } catch (SQLException e) {              
	            e.printStackTrace();
	        }
	    }
	}
}
