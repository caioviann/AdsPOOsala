package ads.poo.produtos;

public class Celular extends Telefone {
    private String sistemaOp;

    public Celular(int codigo, String numSerie, String modelo, float peso, Dimensao dim, String sistemaOp) {
        super(codigo, numSerie, modelo, peso, dim);
        this.sistemaOp = sistemaOp;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
}
