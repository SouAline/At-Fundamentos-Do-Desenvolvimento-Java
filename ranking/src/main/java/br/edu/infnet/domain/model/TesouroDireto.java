package br.edu.infnet.domain.model;

//import java.time.LocalDateTime;

import br.edu.infnet.domain.exceptions.InvalidTipoException;

public class TesouroDireto extends Ativo{

	private String tipo;
	//private LocalDateTime data; é só alterar para
	private String data;
	private float rentabilidadeAnual;
	
	
	public TesouroDireto(String nome, float valor, int quantidade, String tipo, String data, float rentabilidadeAnual) {
		
		super(nome, valor, quantidade);
		this.tipo = tipo;
		this.data = data;
		this.rentabilidadeAnual = rentabilidadeAnual;
		
		
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Tesouro Direto código: " + super.toString() + "  \nTipo taxa juros a receber: " + this.tipo + "   Data de resgate: " +  this.data + " \nPercentual de rentabilidade anual %: " + this.rentabilidadeAnual + "   Rentabilidade total R$" + this.rentabilidadeAnual);
//		sb.append(super.toString());//Inicia a frase com o nome, valor, quantidade que está na classe mãe (Ativo).
//		sb.append(";");
//		sb.append(this.tipo);
//		sb.append(";");
//		sb.append(this.data);
//		sb.append(";");
//		sb.append(this.rentabilidadeAnual);
//		sb.append(";");
//		sb.append(this.valorRendimento());
		sb.append("\r\n");
		return sb.toString();
	}
	
	
	@Override
	protected float valorRendimento() {
		
		float valor = getValor();
		
		if(tipo.equalsIgnoreCase("prefixado")) {
			valor += getValor() * 0.15f;			
			
		}
		if(tipo.equalsIgnoreCase("selic")) {
			valor += getValor() * 0.05f;		
							
		}
					
		if(tipo.equalsIgnoreCase("Ipca")) {
			valor += getValor() * 0.10f;
			
		}
				
		return valor;
	}
	
	public boolean validaTipo() throws InvalidTipoException {
		
		if(!tipo.equalsIgnoreCase("prefixado")&&(!tipo.equalsIgnoreCase("ipca")&&(!tipo.equalsIgnoreCase("selic"))))
			throw new InvalidTipoException("Tipo de Tesouro Direto inválido, por favor escolha entre IPCA, SELIC ou PREFIXADO");
		return false;
	}

	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getData(){
		return data;
	}
	public void setData(){
		this.data = data;
	}
//	public LocalDateTime getData() {
//		return data;
//	}

//	public void setData(LocalDateTime data) {
//		this.data = data;
//	}

	public float getRentabilidadeAnual() {
		return rentabilidadeAnual;
	}

	public void setRentabilidadeAnual(float rentabilidadeAnual) {
		this.rentabilidadeAnual = rentabilidadeAnual;
	}
	

	
}
