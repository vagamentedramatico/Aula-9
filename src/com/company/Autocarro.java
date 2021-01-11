package com.company;

public class Autocarro extends Veiculo{

    private boolean lotacao50;

    public Autocarro(int lotacaoMax, boolean lotacao50){
        super(lotacaoMax);
        this.lotacao50 = lotacao50;
    }

    @Override
    public int calcularConsumo(){
        if(lotacao50) {
            return (getConsumo() * 2);
        } else {
            return (getConsumo());
        }
    }
}
