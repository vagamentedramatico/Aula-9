package com.company;

public class Barco extends Veiculo{

    public Barco(int lotacaoMax){
        super(lotacaoMax);
    }

    @Override
    public int calcularConsumo(){
        return getConsumo() * 2;
    }
}
