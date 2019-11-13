// Classe com atributos e métodos do "Aluno" que será cadastrado

/********************************************************
 * Atividade Tela de Cadastro de Alunos                 *
 *                                                      *
 * # Criar os seguintes atributos [Tipo String]:        *
 *                                                      * 
 *   nome, curso, aapm, sexo e dataDeNascimento         *
 *                                                      *
 * # Todos atributos devem estar encapsulados, ou seja, * 
 *   sendo acessados apenas dentro da própria classe    *
 *   por meio de GETTERs & SETTERs;                     *
 *                                                      *
 * # Criar construtores englobando todas as             *
 *   possibilidades de construtores.                    *                                                      
 *                                                      *
 ********************************************************/

/*
 * A tabela no Banco de dados
 * 
+--------------------+
| Tables_in_db_aluno |
+--------------------+
| tbl_alunos         |
+--------------------+

+-----------------+--------------+------+-----+---------+----------------+
| Field           | Type         | Null | Key | Default | Extra          |
+-----------------+--------------+------+-----+---------+----------------+
| ra              | int(11)      | NO   | PRI | NULL    | auto_increment |
| nome            | varchar(100) | NO   |     | NULL    |                |
| curso           | varchar(100) | NO   |     | NULL    |                |
| aapm            | varchar(3)   | NO   |     | NULL    |                |
| sexo            | varchar(10)  | NO   |     | NULL    |                |
| data_nascimento | varchar(10)  | NO   |     | NULL    |                |
+-----------------+--------------+------+-----+---------+----------------+
 */


package org.com.db.alunos;

public class Aluno {
	
	private String nome;
	private String curso;
	private String aapm;
	private String sexo;
	private String dataDeNascimento;
	
	// Construtores
	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}

	public Aluno(String nome, String curso, String aapm) {
		this.nome = nome;
		this.curso = curso;
		this.aapm = aapm;
	}

	public Aluno(String nome, String curso, String aapm, String sexo) {
		this.nome = nome;
		this.curso = curso;
		this.aapm = aapm;
		this.sexo = sexo;
	}
	
	public Aluno(String nome, String curso, String aapm, String sexo, String dataDeNascimento) {
		this.nome = nome;
		this.curso = curso;
		this.aapm = aapm;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAapm() {
		return aapm;
	}

	public void setAapm(String aapm) {
		this.aapm = aapm;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	
}
