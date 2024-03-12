package ads.poo;

public class Contador {
    private int valorAtual;

    public int AtribuirValor(int v){
        return valorAtual = v;
    }

    public int Incrementar(){
        return valorAtual++;
    }

    public int getAtualValor(){

        return valorAtual;
    }

}
