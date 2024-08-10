package ads.poo.produtos;

public class SemFio extends Telefone {
    private float frequencia;
    private int canais;
    private float distancia;

    public SemFio(int codigo, String numSerie, String modelo, float peso, Dimensao dim, float frequencia, int canais, float distancia) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String imprimirDados() {
        return  super.imprimirDados() +
                "SemFio: " +
                "frequencia " + frequencia +
                ", canais " + canais +
                ", distancia " + distancia;
    }
}
