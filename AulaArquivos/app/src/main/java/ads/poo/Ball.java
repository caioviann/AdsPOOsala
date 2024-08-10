package ads.poo;

import java.util.Objects;

public class Ball {
    private String tipo;
    private double tamanho;
    private double peso;
    private String cor;

    public Ball(String tipo, double tamanho, double peso, String cor) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball bola = (Ball) o;
        return Double.compare(tamanho, bola.tamanho) == 0 && Double.compare(peso, bola.peso) == 0 && Objects.equals(tipo, bola.tipo) && Objects.equals(cor, bola.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, tamanho, peso, cor);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "tipo='" + tipo + '\'' +
                ", tamanho=" + tamanho +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                '}';
    }
}
