package com.company;
import java.util.Random;

public class Veiculo{
    public Veiculo(){
        x = 0;
        y = 0;
        velocidade = 0;
        fabrica = false;
        cor = null;
    }

    public Veiculo(int xx,int yy, String modelo,int aux) {
        x = xx;
        y = yy;
        posicaoAntiga = aux;
        cor = modelo;
        if (cor == "uno") {
            velocidade = 2;
        } else if (cor == "moto") {
            velocidade = 3;
        } else if (cor == "zero") {
            velocidade = 0;
        } else {
            velocidade = 1;
        }
    }

    public void id() {
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
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public void setX(){
        Random meu = new Random();
        x = meu.nextInt(30);
    }

    public void setY(){
        Random meu = new Random();
        y = meu.nextInt(60);
    }

    public void setX(int p){
        x = p;
    }

    public void setY(int p){
        y = p;
    }

    public void setVelocidade(int n){
        velocidade = n;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setPosicaoAntiga(int pn){
        posicaoAntiga = pn;
    }

    public int getPosicaoAntiga(){
    return posicaoAntiga;
    }

    private int posicaoAntiga;
    private int y;
    private int x;
    private int velocidade;
    private boolean fabrica;
    private String cor;
}