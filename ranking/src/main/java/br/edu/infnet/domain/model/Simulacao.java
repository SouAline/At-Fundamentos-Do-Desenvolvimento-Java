package br.edu.infnet.domain.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Simulacao {

     private Usuario usuario;
     private LocalDateTime data;
     private String descricao;
     private float simulacao;


     public Simulacao() {

          data = LocalDateTime.now();
     }

     @Override
     public String toString() {
          DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
          return String.format("%s %s %s",
                  this.usuario.getNome(),
                  this.descricao,
                  this.data.format(formato)
          );
     }


     public void balanco() {

     }
     public float getSimulacao(){
          return simulacao;
     }

     public Usuario getUsuario() {
          return usuario;
     }

     public void setUsuario(Usuario usuario) {
          this.usuario = usuario;
     }

     public LocalDateTime getData() {
          return data;
     }

     public void setData(LocalDateTime data) {
          this.data = data;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }
}