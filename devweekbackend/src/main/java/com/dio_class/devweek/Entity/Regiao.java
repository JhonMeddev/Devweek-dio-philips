package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String regiao;

    private Long total_exames;

    public Regiao(String regiao, Long qnt_exames) {
        this.regiao = regiao;
        this.total_exames = qnt_exames;
    }

    public Regiao(){}

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQnt_exames() {
        return total_exames;
    }

    public void setQnt_exames(Long qnt_exames) {
        this.total_exames = qnt_exames;
    }
}
