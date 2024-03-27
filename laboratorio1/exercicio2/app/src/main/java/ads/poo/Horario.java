package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;
    String[] hE = {"zero", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove", "vinte",
            "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro"};


    String[] mE = {"zero", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove", "vinte", "trinta", "quarenta", "cinquenta"};



    public Horario() {
        this(0, 0, 0);
    }

    public Horario(int h) {
        this(h, 0, 0);
    }

    public Horario(int h, int m) {
        this(h, m, 0);
    }

    public Horario(int h, int m, int s) {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        this.setHora(h);
        this.setMinuto(m);
        this.setSegundo(s);
    }

    public boolean setHora(int h) {
        if (h < 0 || h > 23) {
            return false;
        } else {
            this.hora = h;
            return true;
        }


    }

    public boolean setMinuto(int m) {
        if (m < 0 || m > 59) {
            return false;
        } else {
            this.minuto = m;
            return true;
        }

    }

    public boolean setSegundo(int s) {
        if (s < 0 || s > 59) {
            return false;
        } else {
            this.segundo = s;
            return true;
        }

    }



    // String.format

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
