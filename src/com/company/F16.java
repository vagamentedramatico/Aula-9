package com.company;

public class F16 extends Veiculo{

    private boolean resgate;

    public F16(int lotacaoMax, boolean resgate){
        super(lotacaoMax);
        this.resgate = resgate;
    }

    @Override
    public int calcularConsumo(){
        if(resgate) {
            return (getConsumo() * 4);
        } else {
            return (getConsumo() * 3);
        }
    }

}
