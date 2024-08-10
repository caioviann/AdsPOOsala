package org.example;

public enum Naipe {
    PAUS("\u2660"),
    OUROS("\u2665"),
    COPAS("\u2666"),
    ESPADAS("\uu2663");

    public String codigo;

    Naipe(String codigo) {
        this.codigo = codigo;
    }
}
