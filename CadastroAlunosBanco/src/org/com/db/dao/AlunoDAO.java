// Classe que faz a persistência no banco de dados [SGBD MySQL/MariaDB]

/****************************************
 * Atividade Tela de Cadastro de Alunos *
 *                                      *
 * Nada a fazer nesta classe            *
 ****************************************/

package org.com.db.dao;

import java.sql.PreparedStatement;

import org.com.db.alunos.Aluno;
import org.com.db.jdbc.Conexao;

public class AlunoDAO {
	
	private Aluno aluno;
    
	public Aluno getAluno() {
        return this.aluno;
    }
     
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    // Método para gravação no banco de dados
    public boolean gravar() {
    	// Comando SQL para persistência de dados
        String sql = "INSERT INTO tbl_alunos"
                 +   "(nome, curso, aapm, sexo, data_nascimento)"
                 +   "VALUES (?, ?, ?, ?, ?)";         
	    try {                       
	        PreparedStatement stm = Conexao.getConexao().prepareStatement(sql);
	        stm.setString(1, aluno.getNome());
	        stm.setString(2, aluno.getCurso());
	        stm.setString(3, aluno.getAapm());
	        stm.setString(4, aluno.getSexo());
	        stm.setString(5, aluno.getDataDeNascimento());
	         
	        stm.execute();          
	        Conexao.fecharConexao();    
	         
	        return true;
	         
	    } catch (Exception erro) {
	        System.out.println("Oops! Ocorreu um erro na conexão!");
	        erro.printStackTrace();         
	        return false;
	    }
    }
}
