package org.example;

public class Gorda  extends VacaDecorator{
    public Gorda(Vaca vaca){
        super(vaca);
    }
    public float getPercentualPreco(){
        return 0.5f;
    }
}
