package com.company;
//import java.awt.Color;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Carro> car = new ArrayList<>();
        int x,y;
        Veiculo aux = new Veiculo();
        for (int i = 0; i < (car.size() + 1); i++){
            x = aux.aleatorio();
            y = aux.aleatorio();
            car.add(new Carro(x,y));

        }
        Mundo a = new Mundo();
        a.desenhaMundo();
    }
}