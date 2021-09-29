package br.edu.infnet.domain.model;
import javax.persistence.Entity;

@Entity
public class TesouroDireto extends Ativo{
    private String tipo;
    private String data;
    private float rentabilidadeAnual;

    public TesouroDireto(){

    }

    public TesouroDireto(String nome, float valor, Integer quantidade) {
        super(nome, valor, quantidade);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getRentabilidadeAnual() {
        return rentabilidadeAnual;
    }

    public void setRentabilidadeAnual(float rentabilidadeAnual) {
        this.rentabilidadeAnual = rentabilidadeAnual;
    }
}
