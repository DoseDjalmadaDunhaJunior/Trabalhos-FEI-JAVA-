package com.company;
import java.util.Random;

public class Mundo {
    public Mundo() {
        zeraMundo();
        primeiros();
        desenhaMundo(mapa);
    }

    ///é executado no loop do main
    public void start() {
        colisao();
        geraVeiculos();
        mudaMundo();
        desenhaMundo(mapa);
        numeros();
        zeraMundo();
    }

    ///cria os primeiros carros e indica o tamanho inicial dos vetores de cada veiculo
    public void primeiros() {
        for (int i = 0; i < uno.length; i++) {
            but.setX();
            but.setY();
            uno[i] = new Carro(but.getX(), but.getY());
            uno[i].setVelocidade(0);
            but.setX();
            but.setY();
            boy[i] = new Moto(but.getX(), but.getY());
            boy[i].setVelocidade(0);
            but.setX();
            but.setY();
            bino[i] = new Caminhao(but.getX(), but.getY());
            bino[i].setVelocidade(0);
        }

        for (int i = 0; i < 10; i++) {
            uno[i].setVelocidade(2);
            boy[i].setVelocidade(3);
            bino[i].setVelocidade(1);
        }
    }

    ///desenha o mapa substituindo cada numero por uma cor
    public void desenhaMundo(int vet[][]) {
        for (int i = 0; i < tamX; i++) {
            for (int j = 0; j < tamY; j++) {
                ///borda
                if (vet[i][j] == 9 || vet[i][j] == 8 || vet[i][j] == 7) {
                    ///caminhoes
                    if (vet[i][j] == 9) {
                        //System.out.print("\u001b[44m \u001b[0m");
                        System.out.print("\u001b[43;1m \u001b[0m");
                    }
                    ///carros
                    if (vet[i][j] == 8) {
                        //System.out.print("\u001b[43;1m \u001b[0m");
                        System.out.print("\u001b[41;1m \u001b[0m");
                    }
                    ///motos
                    if (vet[i][j] == 7) {
                        //System.out.print("\u001b[41;1m \u001b[0m");
                        System.out.print("\u001b[44m \u001b[0m");
                    }
                } else if (vet[i][j] == 1 || vet[i][j] == 2) {
                    if (vet[i][j] == 1) {
                        System.out.print("\u001b[47;1m \u001b[0m");
                    }
                    ///fabricas
                    if (vet[i][j] == 2) {
                        System.out.print("\u001b[42;1m \u001b[0m");
                    }
                } else {
                    ///espaco em branco
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    ///anda com cada veiculo
    public void mudaMundo() {
        for (int i = 0; uno[i].getVelocidade() != 0; i++) {
            uno[i].move(uno[i]);
            mapa[uno[i].getX()][uno[i].getY()] = 8;
        }
        for (int i = 0; boy[i].getVelocidade() != 0; i++) {
            boy[i].move(boy[i]);
            mapa[boy[i].getX()][boy[i].getY()] = 7;
        }
        for (int i = 0; bino[i].getVelocidade() != 0; i++) {
            bino[i].move(bino[i]);
            mapa[bino[i].getX()][bino[i].getY()] = 9;
        }

    }

    ///o mapa vazio
    public void zeraMundo() {
        int mapaAux[][] =
                {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        mapa = mapaAux;
    }

    ///chama as funcoes que detectam e trabalham com a colisao
    public void colisao() {
        bateCarro();
        bateCaminhao();
        bateMoto();
    }

    ///elimina o carro que colide
    public void bateCarro() {
        int gg = 0, pp = 0;
        while (uno[gg].getVelocidade() != 0) {
            gg++;
        }
        while (bino[pp].getVelocidade() != 0) {
            pp++;
        }
        ///carro -> caminhao
        for (int i = 0; i < gg; i++) {
            for (int j = 0; j < pp; j++) {
                if ((uno[i].getX() == bino[j].getX()) && (uno[i].getY() == bino[j].getY())) {
                    uno[i].setVelocidade(0);
                }
            }
        }
        //carro -> moto
        gg = 0;
        pp = 0;
        while (uno[gg].getVelocidade() != 0) {
            gg++;
        }
        while (boy[pp].getVelocidade() != 0) {
            pp++;
        }
        for (int i = 0; i < gg; i++) {
            for (int j = 0; j < pp; j++) {
                if ((uno[i].getX() == boy[j].getX()) && (uno[i].getY() == boy[j].getY())) {
                    boy[i].setVelocidade(0);
                }
            }
        }
        //carro -> carro
        pp = 0;
        gg = 0;
        while (uno[gg].getVelocidade() != 0) {
            gg++;
        }
        while (uno[pp].getVelocidade() != 0) {
            pp++;
        }
        for (int i = 0; i < gg; i++) {
            for (int j = 0; j < pp; j++) {

                if (i == j) {

                } else {
                    if ((uno[i].getX() == uno[j].getX()) && (uno[i].getY() == uno[j].getY())) {
                        uno[i].setVelocidade(0);
                        uno[j].setVelocidade(0);
                    }
                }
            }
        }
    }

    ///elimina o caminhao que colide
    public void bateCaminhao() {
        ///caminhao -> moto
        int gg = 0, pp = 0;
        while (bino[gg].getVelocidade() != 0) {
            gg++;
        }
        while (boy[pp].getVelocidade() != 0) {
            pp++;
        }
        for (int i = 0; i < gg; i++) {
            for (int j = 0; j < pp; j++) {
                if ((bino[j].getX() == boy[i].getX()) && (bino[j].getX() == boy[i].getY())) {
                    boy[i].setVelocidade(0);
                }
            }
        }
        //caminhao -> caminhao
        gg = 0;
        pp = 0;

        while (bino[gg].getVelocidade() != 0) {
            gg++;
        }
        while (bino[pp].getVelocidade() != 0) {
            pp++;
        }
        for (int i = 0; i < pp; i++) {
            for (int j = 0; j < gg; j++) {
                if (i == j) {

                } else {
                    if ((bino[i].getX() == bino[j].getX()) && (bino[i].getX() == bino[j].getY())) {
                        bino[i].setVelocidade(0);
                        bino[j].setVelocidade(0);
                    }
                }
            }
        }
    }

    ///elimina a moto que colide
    public void bateMoto() {
        ///moto -> moto
        int gg = 0, pp = 0;
        while (boy[gg].getVelocidade() != 0) {
            gg++;
        }
        while (boy[pp].getVelocidade() != 0) {
            pp++;
        }
        for (int i = 0; i < pp; i++) {
            for (int j = 0; j < gg; j++) {
                if (i == j) {

                } else {
                    if ((boy[i].getX() == boy[j].getX()) && (boy[i].getX() == boy[j].getY())) {
                        boy[i].setVelocidade(0);
                        boy[j].setVelocidade(0);
                    }
                }
            }
        }
    }

    ///chama as funcoes que geram novos veiculos que passam pelas fabricas
    public void geraVeiculos() {
        geraMoto();
        geraCarro();
        geraCaminhao();
    }

    ///gera novos carros
    public void geraCarro() {
        int tamanho = 0;
        while (uno[tamanho].getVelocidade() != 0) {
            tamanho++;
        }
        Random meu = new Random();
        for (int i = 0; i < tamanho; i++) {
            if (mapa[uno[i].getX()][uno[i].getY()] == 2) {
                if (uno[i].getPosicaoAntiga() == 0) {
                    uno[tamanho].setX(meu.nextInt(29));
                    uno[tamanho].setY(meu.nextInt(29));
                    uno[tamanho].setVelocidade(2);
                    uno[tamanho].setPosicaoAntiga(0);
                    uno[i].setPosicaoAntiga(2);
                }
            } else {
                uno[i].setPosicaoAntiga(mapa[uno[i].getX()][uno[i].getY()]);
            }
        }
    }

    ///gera novas motos
    public void geraMoto() {
        int tamanho = 0;
        while (boy[tamanho].getVelocidade() != 0) {
            tamanho++;
        }
        Random meu = new Random();
        for (int i = 0; i < tamanho; i++) {
            if (mapa[boy[i].getX()][boy[i].getY()] == 2) {
                if (boy[i].getPosicaoAntiga() == 0) {
                    boy[tamanho].setX(meu.nextInt(29));
                    boy[tamanho].setY(meu.nextInt(29));
                    boy[tamanho].setVelocidade(3);
                    boy[tamanho].setPosicaoAntiga(0);
                    boy[i].setPosicaoAntiga(2);
                }
            } else {
                boy[i].setPosicaoAntiga(mapa[boy[i].getX()][boy[i].getY()]);
            }
        }
    }

    ///gera novos caminhoes
    public void geraCaminhao() {
        int tamanho = 0;
        while (bino[tamanho].getVelocidade() != 0) {
            tamanho++;
        }
        Random meu = new Random();
        for (int i = 0; i < tamanho; i++) {
            if (mapa[bino[i].getX()][bino[i].getY()] == 2) {
                if (bino[i].getPosicaoAntiga() == 0) {
                    bino[tamanho].setX(meu.nextInt(29));
                    bino[tamanho].setY(meu.nextInt(29));
                    bino[tamanho].setVelocidade(1);
                    bino[tamanho].setPosicaoAntiga(0);
                    bino[i].setPosicaoAntiga(2);
                }
            } else {
                bino[i].setPosicaoAntiga(mapa[bino[i].getX()][bino[i].getY()]);
            }
        }
    }

    ///legenda e quantidade dos veiculos
    public void numeros() {
        int tamBoy = 0, tamUno = 0, tamBino = 0;
        while (uno[tamUno].getVelocidade() != 0) {
            tamUno++;
        }
        while (boy[tamBoy].getVelocidade() != 0) {
            tamBoy++;
        }
        while (bino[tamBino].getVelocidade() != 0) {
            tamBino++;
        }
        ///meramente uma legenda
        System.out.print("-----LEGENDA-----\n" +
                "MOTOS = \u001b[44m \u001b[0m  Motos: " + tamBoy +
                "\nCAMINHOES = \u001b[43;1m \u001b[0m  Caminhoes: " + tamBino +
                "\nCARROS = \u001b[41;1m \u001b[0m  Carros: " + tamUno);
    }

    ///[30][60]
    private int mapa[][];
    private int tamX = 30;
    private int tamY = 60;
    private Veiculo but = new Veiculo();
    private Carro[] uno = new Carro[1800];
    private Moto[] boy = new Moto[1800];
    private Caminhao[] bino = new Caminhao[1800];

}
