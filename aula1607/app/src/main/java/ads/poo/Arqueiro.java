package ads.poo;

public class Arqueiro extends Personagem{
    private String flecha;

    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return  "Arquerio andando";
    }

    @Override
    public String movimentar() {
        return "Arqueiro andando";
    }
}
