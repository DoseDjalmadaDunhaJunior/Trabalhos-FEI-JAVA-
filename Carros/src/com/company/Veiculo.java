package com.company;
import java.util.Random;

public class Veiculo extends Mundo{
    public void move() {

    }

    public int aleatorio() {
        Random meu = new Random();
        int x;
        x = meu.nextInt(30);
        return x;
    }

    private int y;
    private int x;
    private int velocidade;
    private boolean fabrica;
    private String cor;
}
