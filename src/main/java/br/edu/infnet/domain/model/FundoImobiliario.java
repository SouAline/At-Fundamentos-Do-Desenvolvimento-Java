package br.edu.infnet.domain.model;

import br.edu.infnet.domain.exceptions.ValorInvalidoException;

import javax.persistence.Entity;

@Entity
public class FundoImobiliario extends Ativo{

    private String empresa;
    private float dividendo;
    private int risco;

    public FundoImobiliario(){

    }
    public FundoImobiliario(String empresa, float dividendo, int risco){
        super(empresa, dividendo, risco);

    }


    public float calculaValorBruto() throws ValorInvalidoException{
        if(this.dividendo <=0){
            throw new ValorInvalidoException("[Dividendo] O dividendo não pode ser negativo" + this.dividendo);
        }
        float valorTotal = this.dividendo * 12;
        return valorTotal;
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
