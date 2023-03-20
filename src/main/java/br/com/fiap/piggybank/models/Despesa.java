package br.com.fiap.piggybank.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    private LocalDate data;
    private String descricao;

    protected Despesa(){}
   
    public Despesa(BigDecimal valor, LocalDate data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }


    
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Despesa [valor=" + valor + ", data=" + data + ", descricao=" + descricao + "]";
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

}
