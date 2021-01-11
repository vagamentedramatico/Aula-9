package com.company;

public class Mota extends Veiculo{

    public Mota(int lotacaoMax){
        super(lotacaoMax);
    }

    @Override
    public int calcularConsumo(){
        return getConsumo();
    }

}
