package com.company;

public class Carro extends Veiculo{
    public Carro(int x, int y) {

        super(x, y, "uno");
        forcaMove();
    }

    public void forcaMove(){
        super.move();
    }

    public int gety(){
        return getY();
    }

    public int getx(){
        return getX();
    }

    private int numPessoa;
}
