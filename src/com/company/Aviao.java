package com.company;

public class Aviao extends Veiculo{

    public Aviao(int lotacaoMax){
        super(lotacaoMax);
        }

    @Override
    public int calcularConsumo(){
        return getConsumo() * 3;
    }
}
