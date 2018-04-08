package com.company;
//import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random meu = new Random();
        ArrayList<Carro> car = new ArrayList<>();
        ArrayList<Moto> boy = new ArrayList<>();
        ArrayList<Caminhao> bino = new ArrayList<>();
        Mundo a = new Mundo();

        int[][] vet;// = new int[30][60];
        vet = a.getMapa();
        Veiculo aux = new Veiculo();
        int k = 0;
        while (k < 2){
            for (int i = 0; i < 2; i++) {
                //System.out.println(a.getMapa()[x][y]);
                car.add(new Carro(meu.nextInt(30), meu.nextInt(60)));
                boy.add(new Moto(meu.nextInt(30), meu.nextInt(60)));
                bino.add(new Caminhao(meu.nextInt(30), meu.nextInt(60)));

            }

            for (int i = 0; i < car.size(); i++) {
/*
            a.mudaMundo(car.get(i).getx(),car.get(i).gety(),8);
            a.mudaMundo(bino.get(i).getx(),bino.get(i).gety(),9);
            a.mudaMundo(boy.get(i).getx(),boy.get(i).gety(),7);
*/
                a.experienciaMudaMundo(boy.get(i), car.get(i), bino.get(i));
            }
            //System.out.println(a.getMapa()[0][0]);
            a.desenhaMundo(vet);
            k++;
            a.zeraMundo();
        }
    }
}