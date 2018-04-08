package com.company;

public class Caminhao  extends Veiculo{
    public Caminhao(int x, int y){
    super(x,y,"bino");
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

    private int carga_pesada;
}
