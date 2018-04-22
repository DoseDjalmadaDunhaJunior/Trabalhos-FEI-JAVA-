package com.company;
import java.util.Random;

public class Veiculo{
    ///inicia o veiculo com todos os privates zerados
    public Veiculo(){
        x = 0;
        y = 0;
        velocidade = 0;
        cor = null;
    }
    ///inicia os veiculos ja com alguns privates iniciados e dado valores
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
    ///retorna um valor para Y que no caso sera a posicao
    public int getY(){
        return y;
    }

    ///salva um valor para Y que no caso sera a posicao
    public void setY(int p){
        y = p;
    }

    ///retorna um valor para X que no caso sera a posicao
    public int getX(){
        return x;
    }

    ///salva um valor para X que no caso sera a posicao
    public void setX(int p){
        x = p;
    }

    ///salva um valor para X que no caso sera a posicao porem aleatorio
    public void setX(){
        Random meu = new Random();
        x = meu.nextInt(30);
    }

    ///salva um valor para Y que no caso sera a posicao posicao porem aleatorio
    public void setY(){
        Random meu = new Random();
        y = meu.nextInt(60);
    }

    ///retorna a velocidade
    public int getVelocidade(){
        return velocidade;
    }

    ///salva a velocidade
    public void setVelocidade(int n){
        velocidade = n;
    }

    ///retorna a velocidade antiga
    public int getPosicaoAntiga(){
    return posicaoAntiga;
    }

    ///salva a posicao antiga
    public void setPosicaoAntiga(int pn){
        posicaoAntiga = pn;
    }

    private int posicaoAntiga;
    private int y;
    private int x;
    private int velocidade;
    private String cor;
}