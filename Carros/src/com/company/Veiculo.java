package com.company;
import java.util.Random;

public class Veiculo extends Mundo{
    public Veiculo(){
        x = 0;
        y = 0;
        velocidade = 0;
        fabrica = false;
        cor = null;
    }

    public Veiculo(int xx,int yy, String modelo){
        x = xx;
        y = yy;
        cor = modelo;
    }

    public void move() {
        int n;
        if(cor == "uno"){
            n = 8;
        }
        else if(cor == "bino"){
            n = 9;
        }
        else if(cor == "moto"){
            n = 7;
        }
        else{
            n = 0;
        }
        super.mudaMundo(x,y,n);
    }

    public int aleatorio() {
        Random meu = new Random();
        int x;
        x = meu.nextInt(30);
        return x;
    }

    public int getY(){
        return y;
    }

    private int y;
    private int x;
    private int velocidade;
    private boolean fabrica;
    private String cor;
}
