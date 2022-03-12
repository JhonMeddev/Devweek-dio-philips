package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private Long Faixa_i;

    private Long Faixa_n;

    private String Descricao;

    public FaixaEtaria(Long faixa_i, Long faixa_n, String descricao) {
        this.Faixa_i = faixa_i;
        this.Faixa_n = faixa_n;
        this.Descricao = descricao;
    }

    public FaixaEtaria(){}

    public Long getId() {
        return id;
    }

    public Long getFaixa_i() {
        return Faixa_i;
    }

    public void setFaixa_i(Long faixa_i) {
        this.Faixa_i = faixa_i;
    }

    public Long getFaixa_n() {
        return Faixa_n;
    }

    public void setFaixa_n(Long faixa_n) {
        this.Faixa_n = faixa_n;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }
}
