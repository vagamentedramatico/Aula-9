package com.company;

public class Pessoas {

    private String nome;
    private boolean temCarta;
    private boolean FA;

    public Pessoas(String nome, boolean temCarta, boolean FA){
        this.nome = nome;
        this.temCarta = temCarta;
        this.FA = FA;
    }

    public String getNome() {
        return nome;
    }

}