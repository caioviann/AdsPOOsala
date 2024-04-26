package org.example;

public class Carro {
    private String cor;
    private String modelo;
    private Motor motor;


    public Carro(String cor, String modelo, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void trocarMotor(Motor motor){
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   public Motor getMotor(){
        return  motor;
   }


    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
