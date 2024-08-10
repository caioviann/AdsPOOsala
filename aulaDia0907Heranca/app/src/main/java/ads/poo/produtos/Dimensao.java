package ads.poo.produtos;

public class Dimensao {
    private double altura;
    private double largura;
    private int profudidade;

    public Dimensao(double altura, double largura, int profudidade) {
        this.altura = altura;
        this.largura = largura;
        this.profudidade = profudidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getProfudidade() {
        return profudidade;
    }

    public void setProfudidade(int profudidade) {
        this.profudidade = profudidade;
    }
}
