package org.example;

public class Nelore implements Vaca {
    public float preco;
    public Nelore(){

    }
    public Nelore(float preco){
        this.preco = preco;
    }
    @Override
    public float getPreco() {
        return preco;
    }

}
