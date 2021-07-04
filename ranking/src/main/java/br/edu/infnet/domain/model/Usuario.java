package br.edu.infnet.domain.model;

public class Usuario {
	
	private String nome;
	private String email;
	private String perfil;
	
	public Usuario(String nome, String email, String perfil) {
		this.nome = nome;
		this.email = email;
		this.perfil = perfil;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("A investidora " + this.nome
				+ " (" + this.email + ")"
				+ " tem o perfil de investimento " + this.perfil
				+ " e possui os seguintes ativos: ");
		sb.append("\r\n");
		return sb.toString();
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
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	

}
