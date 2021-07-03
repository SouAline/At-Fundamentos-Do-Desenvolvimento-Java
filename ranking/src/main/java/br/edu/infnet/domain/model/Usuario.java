package br.edu.infnet.domain.model;

public class Usuario {
	
	private String nome;
	private String email;
	private String perfil;
	
	public Usuario(String nome, String email, String perfil) { //construtor padrão
		this.nome = nome;
		this.email = email;
		this.perfil = perfil;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.email);
		sb.append(";");
		sb.append(this.perfil);
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
