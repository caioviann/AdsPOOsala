package ads.poo;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = "";
        setValor(valor);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public boolean setValor(String valor) {
        if (validacaoEmail(valor)){
            this.valor = valor;
            return true;
        }
        return  false;
    }

    private boolean validacaoEmail(String email){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        return email.matches(eR);
    }

    @Override
    public String toString() {
        return "Email{" + "rotulo='" + rotulo + '\'' + ", valor='" + valor + '\'' + '}';
    }
}
