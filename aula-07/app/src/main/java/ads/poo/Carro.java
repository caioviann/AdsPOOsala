package ads.poo;

public class Carro {
    //atributos
    private double velocidade;
    private String modelo;

    //metodos
    public void acelerar(double intensidade) {
        this.velocidade += intensidade;
    }

    public String obterModelos(){
        return this.modelo;
    }

    public double obterVelocidade(){
        return this.velocidade;
    }
}
