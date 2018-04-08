package com.company;

public class Moto  extends Veiculo{
    public Moto(int x, int y){
    super(x,y,"moto");
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

    private String tipo;
}
