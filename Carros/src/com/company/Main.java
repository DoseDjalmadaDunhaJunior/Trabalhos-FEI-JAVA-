/**
* @ José Djalma da Cunha Júnior
* CC3642
*    o proposito desse programa é
*    ganhar nota de P1
 */
package com.company;
public class Main {
    public static void main(String[] args) {
        Mundo a = new Mundo();
        ///um loop infinito
        while (true) {
            ///da um tempo para acontecer o loop
            try {
                a.start();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                a.start();
                a.zeraMundo();

            }
        }
    }
}