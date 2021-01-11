package com.company;

public abstract class Veiculo {

    private int Pessoas[] passageiros;
    private int consumo = 5;

    public Veiculo(int capacidade) {
        passageiros = new Pessoas[capacidade];
    }

    public boolean addPessoa(Pessoas pessoas) {
        if((getLotacao() == 0 && pessoas.isTemCarta())
            || (getLotacao() > 0 && getLotacao != getCapacidade())) {
        for(int i = 0; i < passageiros.length; i++){
            if (passageiros[i] == null) {
                passageiros[i] = pessoas;
                return true;
                }
            }
        }   return false;
    }

}
