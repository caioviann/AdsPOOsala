package ads.poo;

public class Formula1 {
    private int velocidadeAtual;
    private final int VEL_MAX = 200;


    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Formula1(int velocidade){
        this.velocidadeAtual = velocidade;
    }

    public Formula1(){
        this.velocidadeAtual = 0;
    }

    public int acelerar(int acl){
        velocidadeAtual  += acl;
        if (velocidadeAtual + acl > VEL_MAX){
            return velocidadeAtual = VEL_MAX;
        }else {
            return velocidadeAtual;
        }
    }
    public int frear(int frear){
        velocidadeAtual -= frear;
        if (velocidadeAtual - frear < 0){
            return velocidadeAtual = 0;
        }else {
            return velocidadeAtual;
        }
    }

}
