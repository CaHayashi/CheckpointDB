package br.com.fiap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private Date dtDeNascimento;

	@Override
	public String toString() {
		return "Usuario [nome = " + nome + ", data de nascimento = " + dtDeNascimento + ", email = " + email + ", senha = " + senha + " cpf = " + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getDtDeNascimento() {
		return dtDeNascimento;
	}

	public void setDtDeNascimento(Date dtDeNascimento) {
		this.dtDeNascimento = dtDeNascimento;
	}
	
}
