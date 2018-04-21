package com.company;
//import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        Mundo a = new Mundo();
        Veiculo b = new Veiculo();
        //int k = 0;
        //
        int cont = 0;
        while (true) {
            try {
                a.start();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                a.start();
                //a.desenhaMundo(vet);
                a.zeraMundo();
                System.out.println("matou " + cont + " veiculos");
            }

/*
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

*/

            //}
            // a.desenhaMundo(vet);
        }
    }
}