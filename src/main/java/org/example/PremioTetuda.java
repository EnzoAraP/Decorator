package org.example;

public class PremioTetuda extends VacaDecorator{
    public PremioTetuda(Vaca vaca)
    {
        super(vaca);
    }
    public float getPercentualPreco(){
        return 0.3f;
    }
}
