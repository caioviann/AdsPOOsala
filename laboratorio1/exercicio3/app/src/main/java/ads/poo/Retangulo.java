package ads.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;
    private final String ASCII = "ASCII";
    private final String UTF8 = "UTF8";


    public Retangulo() {
        this(4,3,"ASCII");
    }

    public Retangulo(int largura, int altura, String codificacao) {
        this.largura = 4;
        this.altura = 3;
        this.codificacao = codificacao;

        if(altura > 0 || largura > 0){
            this.largura = largura;
            this.altura = altura;
        }

        if (!codificacao.equals(UTF8) || !codificacao.equals(ASCII)){
            this.codificacao = "ASCII";
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public void setCodificacao(String codificacao) {
        this.codificacao = codificacao;
    }
}

