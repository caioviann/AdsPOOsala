package ads.poo;

public class Carro {
    private int quantCarros = 0;
    private final int IDENTIFICACAO;
    private final int VEL_MAX = 200;
    private final int VEL_MIN = 0;
    private int velocidadeAtual = 0;

    public Carro() {
        quantCarros++;
        this.IDENTIFICACAO = quantCarros;
        this.velocidadeAtual = 0;
    }
    public int acelerarCarro(int acelerar){
        velocidadeAtual += acelerar;
        if(velocidadeAtual + acelerar > VEL_MAX){
            return velocidadeAtual = VEL_MAX;
        }else{
            return velocidadeAtual;
        }
    }

    public int frearCarro(int freio){
        velocidadeAtual -= freio;
        if(velocidadeAtual - freio >= VEL_MIN){
            return velocidadeAtual;
        }else{
            return velocidadeAtual = VEL_MIN;
        }
    }


    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String marcha(){
        if(velocidadeAtual < 15){
            return "1 marcha";
        } else if (velocidadeAtual > 15 && velocidadeAtual < 30){
            return "2 marcha";
        } else if (velocidadeAtual > 30 && velocidadeAtual < 55) {
            return "3 marcha";
        } else if (velocidadeAtual > 55 && velocidadeAtual < 80) {
            return "4 marcha";
        }else {
            return "5 marcha";
        }
    }

}
