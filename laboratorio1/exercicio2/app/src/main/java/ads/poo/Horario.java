package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    private final String[] uni = {"zero", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove"};


    private final String[] dez = {"", "", "vinte", "trinta", "quarenta", "cinquenta"};


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

        public String converterNumeroParaExtenso() {
            if(hora < 20 && minuto < 20){
                return uni[hora] + " hora(s) , " +  uni[minuto] + " minuto(s) e "
                        + dez[segundo / 10] + (segundo % 10 != 0 ? " e " + uni[segundo % 10]: "") + " segundo(s)";
            } else if (hora < 20 && segundo < 20) {
                return uni[hora] + " hora(s) , "
                        + dez[minuto / 10] + (minuto % 10 != 0 ? " e " + uni[minuto % 10] : "") + " minuto(s) e "
                        + uni[segundo] + " segundo(s)";
            } else if (minuto < 20 && segundo <20) {
                return dez[hora / 10] + (hora % 10 != 0 ? " e " + uni[hora % 10] : "") + " hora(s) , "
                        + uni[minuto] + " minuto(s) e" + uni[minuto] + " minuto(s)";

            } else if (minuto > 19 && segundo > 19) {
                return uni[hora] + " hora(s) , "
                        + dez[minuto / 10] + (minuto % 10 != 0 ? " e " + uni[minuto % 10] : "") + " minuto(s) e "
                        + dez[segundo / 10] + (segundo % 10 != 0 ? " e " + uni[segundo % 10]: "") + " segundo(s)";
            }else if(hora > 19 && segundo > 19){
                return dez[hora / 10] + (hora % 10 != 0 ? " e " + uni[hora % 10] : "") + " hora(s) , "
                        + uni[minuto] + " minuto(s)"
                        + dez[segundo / 10] + (segundo % 10 != 0 ? " e " + uni[segundo % 10]: "") + " segundo(s)";
            } else if (hora > 19 && minuto > 19) {
                return dez[hora / 10] + (hora % 10 != 0 ? " e " + uni[hora % 10] : "") + " hora(s) , "
                       + dez[minuto / 10] + (minuto % 10 != 0 ? " e " + uni[minuto % 10] : "") + " minuto(s) e "
                       + uni[segundo] + " segundo(s) ";
            } else {
                return dez[hora / 10] + (hora % 10 != 0 ? " e " + uni[hora % 10] : "") + " hora(s) , "
                        + dez[minuto / 10] + (minuto % 10 != 0 ? " e " + uni[minuto % 10] : "") + " minuto(s) e "
                        + dez[segundo / 10] + (segundo % 10 != 0 ? " e " + uni[segundo % 10]: "") + " segundo(s)";

            }
        }

    // String.format

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
