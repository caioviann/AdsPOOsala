package ads.poo;

public class Aldeao extends  Personagem{
    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Aldeão Atacando";
    }

    @Override
    public String movimentar() {
        return "Aldeão andando";

    }
}
