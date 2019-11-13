package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date dataDeNascimento;

	/* Construtor */
	public Cliente(String nome, String email, Date dataDeNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
	}

	/* Getters */
	public String getnome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	/* toString */
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return nome + ", " + "(" + sdf.format(dataDeNascimento) + ") - " + email;
	}

}
