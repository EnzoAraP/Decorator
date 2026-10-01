package org.example;

public class OuvirMusicaClassica extends VacaDecorator{
    public OuvirMusicaClassica(Vaca vaca){
        super(vaca);
    }
    public float getPercentualPreco(){
        return 1.0f;
    }
}
