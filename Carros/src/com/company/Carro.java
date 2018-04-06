package com.company;

public class Carro extends Veiculo{
    public Carro(int x, int y){
    super(0,2,"uno");
    forcaMove();
    }

    public void forcaMove(){
        super.move();
    }

    public int posicao(){
        int x;
        x = super.aleatorio();
        return x;
    }

    private int numPessoa;
}
