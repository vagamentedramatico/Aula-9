package com.company;

public class Ferry extends Veiculo{

    public Ferry(int lotacaoMax){
        super(lotacaoMax);
    }

    @Override
    public int calcularConsumo(){
        return getConsumo() * 2;
    }
}
