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

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public int getBug(int x,int y){
        return super.getMapa()[x][y];
    }

    public void imprimeMapa(){
        int[][] vet = new int[30][60];
        vet = super.getMapa();
        super.desenhaMundo(vet);
    }

    private int y;
    private int x;
    private int velocidade;
    private boolean fabrica;
    private String cor;
}
