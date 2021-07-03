package br.edu.infnet.domain.model;

import br.edu.infnet.domain.exceptions.InvalidRiscoException;

public class FundoImobiliario extends Ativo{
	
	private String empresa;
	private float dividendo;
	private int risco;
	

	public FundoImobiliario(String nome, float valor, int quantidade, String empresa, float dividendo, int risco) {
		super(nome, valor, quantidade);
		this.empresa = empresa;
		this.dividendo = dividendo;
		this.risco = risco;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Fundo Imobiliário código: " + super.toString() + " \nEmpresa: " + this.empresa + "   Dividendo R$ " + this.dividendo + "   Risco: " + this.risco + " \nValor total anual R$" + this.valorRendimento());
//		sb.append(super.toString());
//		sb.append(";");
//		sb.append(this.empresa);
//		sb.append(";");
//		sb.append(this.dividendo);
//		sb.append(";");
//		sb.append(this.risco);
//		sb.append(";");
//		sb.append(this.valorRendimento());
		sb.append("\r\n");
		return sb.toString();
	}
	

	@Override
	protected float valorRendimento() {
		
		float valor = getValor() + (dividendo * 12.0f);
		
		return valor;
	}

	public boolean validaRisco() throws InvalidRiscoException {
		if(risco < 1)
			throw new InvalidRiscoException("O risco não pode ser menor que 1 pois todo investimento tem risco!!!");
		return false;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public float getDividendo() {
		return dividendo;
	}

	public void setDividendo(float dividendo) {
		this.dividendo = dividendo;
	}

	public int getRisco() {
		return risco;
	}

	public void setRisco(int risco) {
		this.risco = risco;
	}
	
	

}
