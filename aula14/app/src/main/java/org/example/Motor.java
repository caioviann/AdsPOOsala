package org.example;

public class Motor {
    private int cilindradas;
    private int hp;

    public Motor(int hp, int cilindradas) {
        this.cilindradas = cilindradas;
        this.hp = hp;
    }


    @Override
    public String toString() {
        return String.format("cilindrada: $s, HP: $s", cilindradas, hp);
    }
}
