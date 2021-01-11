package com.company;

public class Automovel extends Veiculo{

    public Automovel(int lotacaoMax){
        super(lotacaoMax);
    }

    @Override
    public int calcularConsumo(){
            return getConsumo();
    }

}
