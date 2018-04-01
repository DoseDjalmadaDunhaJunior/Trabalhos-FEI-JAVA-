package com.company;

public class Carro extends Veiculo{
    public Carro(int x, int y){

    }
    public int posicao(){
        int x;
        x = super.aleatorio();
        return x;
    }
    private int numPessoa;
}
