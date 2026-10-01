package org.example;

public abstract class VacaDecorator implements Vaca {
    private Vaca vaca;
    public VacaDecorator(Vaca vaca){
        this.vaca=vaca;
    }

    public Vaca getVaca() {
        return vaca;
    }

    public void setVaca(Vaca vaca) {
        this.vaca = vaca;
    }
    public abstract float getPercentualPreco();
    public float getPreco(){
        return this.vaca.getPreco() *(1+(this.getPercentualPreco()));
    }

}
