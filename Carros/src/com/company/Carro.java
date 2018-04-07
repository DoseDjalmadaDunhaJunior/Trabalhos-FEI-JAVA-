package com.company;

public class Carro extends Veiculo{
    public Carro(int x, int y) {

        super(x, y, "uno");
        forcaMove();
    }

    public void forcaMove(){
        super.move();
        System.out.println(super.getBug(0,0));
    }

    public int posicao(){
        int x;
        x = super.aleatorio();
        return x;
    }

    public int gety(){
        return getY();
    }

    public int getx(){
        return getX();
    }

    public void imprime(){
        super.imprimeMapa();
    }

    public int oito(){
        return 8;
    }
    private int numPessoa;
}
