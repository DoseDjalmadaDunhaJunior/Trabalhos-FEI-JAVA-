package com.company;

import java.util.Random;

public class Carro extends Veiculo {
    public Carro(int x, int y) {
        super(x, y, "uno", 0);
    }

    ///logica para o carro se mover no mapa
    public void move(Carro a) {
        Random meu = new Random();
        int num = meu.nextInt(4);
        if (num == 0) {
            int x = a.getX();
            x = x + 2;
            if (x > 28) {
                x = x - 28;
            }
            a.setX(x);
        }

        if (num == 1) {
            int x = a.getX();
            x = x - 2;
            if (x < 2) {
                x = 28 + x;
            }
            a.setX(x);
        }

        if (num == 2) {
            int y = a.getY();
            y = y + 2;
            if (y > 58) {
                y = y - 58;
            }
            a.setY(y);
        }

        if (num == 3) {
            int y = a.getY();
            y = y - 2;
            if (y < 2) {
                y = 58 + y;
            }
            a.setY(y);
        }
    }

}