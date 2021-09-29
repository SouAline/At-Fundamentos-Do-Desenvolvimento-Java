package br.edu.infnet.domain.model;

import javax.persistence.Entity;

@Entity
public class Acao extends Ativo {
    private String empresa;
    private float dividendo;
    private Integer risco;

    public Acao(){

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

    public Integer getRisco() {
        return risco;
    }

    public void setRisco(Integer risco) {
        this.risco = risco;
    }
}
