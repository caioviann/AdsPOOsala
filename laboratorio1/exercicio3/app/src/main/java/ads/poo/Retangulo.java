package ads.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;
    private static final String ASCII = "ASCII";
    private static final String UTF8 = "UTF8";


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

        if (!codificacao.equals(UTF8) && !codificacao.equals(ASCII)){
            this.codificacao = "ASCII";
        }
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if(largura > 0){
            this.largura = largura;
            return true;
        }else {
            return false;
        }

    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if(altura > 0){
            this.altura = altura;
            return true;
        }else {
            return false;
        }
    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao.equals(UTF8) || codificacao.equals(ASCII)){
            this.codificacao = codificacao;
            return true;
        }else {
            return false;
        }
    }

    public String areaRetangulo(){
        double area = largura * altura;
        return "Area do retangulo: " + area;
    }

    public String perimetro(){
        double perimetro = 2 * (largura + altura);
        return "Perímetro do retangulo: " + perimetro;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        if(this.codificacao.equals(ASCII)){

            sb.append("+");
            for (int i = 0; i < this.largura - 2; i++) {
                sb.append("-");
            }
            sb.append("+\n");

            for (int i = 0; i < this.altura - 2; i++) {
                sb.append("|");
                for (int j = 0; j < this.largura - 2; j++) {
                    sb.append(" ");
                }
                sb.append("|\n");
            }

            sb.append("+");
            for (int i = 0; i < this.largura - 2 ; i++) {
                    sb.append("-");
            }
            sb.append("+");
        }
        else if (this.codificacao.equals(UTF8)) {
            sb.append("\u250c");
            for (int i = 0; i < this.largura - 2; i++) {
                sb.append("\u2500");
            }
            sb.append("\u2510\n");

            for (int i = 0; i < this.altura - 2; i++) {
                sb.append("\u2502");
                for (int j = 0; j < this.largura - 2; j++) {
                    sb.append(" ");
                }
                sb.append("\u2502\n");
            }
            sb.append("\u2514");
            for (int i = 0; i < this.largura - 2; i++) {
                sb.append("\u2500");
            }
            sb.append("\u2518");
        }

        return sb.toString();
    }
}

