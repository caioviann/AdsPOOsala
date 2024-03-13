package ads.poo;

public class Caneta {
    private String cor = "Preta";
    private int quanTinta = 100;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuanTinta() {
        return quanTinta;
    }

    public void setQuanTinta(int quanTinta) {
        this.quanTinta = quanTinta;
    }

    public String Desenhando(){
        // TODO caneta não desenha sem tinta
        quanTinta--;
        return "Desenhando na cor: " + cor;
    }
}
