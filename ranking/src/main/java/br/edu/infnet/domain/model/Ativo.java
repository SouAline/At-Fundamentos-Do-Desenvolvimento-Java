package br.edu.infnet.domain.model;

public abstract class Ativo {
	
	protected String nome;
	protected float valor;
	protected int quantidade;
	
	
	
	public Ativo(String nome, float valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}	
	
	
	@Override	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.valor);
		sb.append(";");
		sb.append(this.quantidade);
		return sb.toString();
	}
		
	protected abstract float valorRendimento();
	
	
	
	public String getNome() {
		return nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

}
