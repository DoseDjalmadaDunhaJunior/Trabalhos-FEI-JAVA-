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
        //int k = 0;
        //
        int cont = 0;
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                a.desenhaMundo(vet);
                a.zeraMundo();
                System.out.println("matou " + cont + " veiculos");
            }
            //while (k < 2) {
            for (int i = 0; i < 30; i++) {
                //System.out.println(a.getMapa()[x][y]);
                car.add(new Carro(meu.nextInt(30), meu.nextInt(60)));
                boy.add(new Moto(meu.nextInt(30), meu.nextInt(60)));
                bino.add(new Caminhao(meu.nextInt(30), meu.nextInt(60)));
            }

            int max,min,med;
                if(car.size() >= bino.size()){
                    max = car.size();
                    min = bino.size();
                }
                else{
                    min = car.size();
                    max = bino.size();
                }
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < min; j++) {
                    if (i == j) {

                    } else {
                        if (((car.get(i).getX() == car.get(j).getX()) && (car.get(i).getY() == car.get(j).getY()))) {
                            //car.remove(i);
                            //car.remove(j);
                            //car.add()
                            cont++;
                        } else if ((car.get(i).getX() == bino.get(j).getX()) && (car.get(i).getY() == bino.get(j).getY())) {
                            //car.remove(i);
                            cont++;
                        }
                    }
                }
            }
            if(car.size() >= boy.size()){
                max = car.size();
                min = bino.size();
            }
            else{
                min = car.size();
                max = bino.size();
            }
            for (int i = 0; i < boy.size(); i++) {
                for (int j = 0; j < boy.size(); j++) {
                    if (i == j) {

                    } else {
                        if (((boy.get(i).getX() == boy.get(j).getX()) && (boy.get(i).getY() == boy.get(j).getY()))) {
                            //boy.remove(i);
                            //boy.remove(j);
                            cont++;
                        }
                    }
                }
            }
            for (int i = 0; i < bino.size(); i++) {
                for (int j = 0; j < bino.size(); j++) {
                    if (i == j) {

                    } else {
                        if (((bino.get(i).getX() == bino.get(j).getX()) && (bino.get(i).getY() == bino.get(j).getY()))) {
                            //bino.remove(i);
                            //bino.remove(j);
                            cont++;
                        } else if (((bino.get(i).getX() == car.get(j).getX()) && (bino.get(i).getY() == car.get(j).getY()))) {
                            //car.remove(j);
                            cont++;
                        }
                        else if(((bino.get(i).getX() == boy.get(j).getX()) && (bino.get(i).getY() == boy.get(j).getY()))) {
                            //boy.remove(j);
                            cont++;
                        }
                    }
                }
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
            //k++;

            a.desenhaMundo(vet);
            a.zeraMundo();
            System.out.println("matou " + cont + " veiculos");
            //}
            // a.desenhaMundo(vet);
        }
    }
}