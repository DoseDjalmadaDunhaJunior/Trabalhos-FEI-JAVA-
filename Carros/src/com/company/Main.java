package com.company;
//import java.awt.Color;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carro> car = new ArrayList<>();
        Mundo a = new Mundo();
        //a.mudaMundo(0, 0, 8);
        int[][] vet = new int[30][60];
        vet = a.getMapa();
        //System.out.println(vet[0][0]);
        int x, y;
        Veiculo aux = new Veiculo();
        //System.out.println(vet[0][0]);
        for (int i = 0; i < 2; i++) {
            x = aux.aleatorio();
            y = aux.aleatorio();
            System.out.println(a.getMapa()[x][y]);
            car.add(new Carro(x, y));
        }

        for (int i = 0; i < car.size(); i++) {
            a.mudaMundo(car.get(i).getx(),car.get(i).gety(),8);
        }
        //a.populaMapa();
        System.out.println(a.getMapa()[0][0]);
        a.desenhaMundo(vet);
    }
}