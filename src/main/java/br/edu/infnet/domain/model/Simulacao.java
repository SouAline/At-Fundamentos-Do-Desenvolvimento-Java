package br.edu.infnet.domain.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
public class Simulacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "idInvestidor")
    private Investidor investidor;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private List<Ativo> ativos;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Simulacao(){
        data = LocalDateTime.now();
    }

    public Simulacao(String descricao){
        this();
        this.descricao = descricao;
    }

    public String obterSimulacao(){
        return String.format("Simulacao realizado em %s para o investidor %s.",
                this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
                this.investidor.getNome()
        );
    }
    @Override
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s;%s;%s",
                this.descricao,
                this.data.format(formato),
                this.investidor
        );
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDateTime getData() {
        return data;
    }
    public Investidor getInvestidor() {
        return investidor;
    }
    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<Ativo> getAtivos() {
        return ativos;
    }
    public void setAtivos(List<Ativo> ativos) {
        this.ativos = ativos;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

