/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Motor> estante = new ArrayList<>();
        estante.add(garagem.getMotor());


    Carro garagem = new Carro("fusca","branco", new Motor(60, 1500));

    garagem.trocarMotor(new Motor(110, 2000));

    garagem = new Carro("uno", "branco", new Motor(40, 1000));



    }
}
