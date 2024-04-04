package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    private static final String[] HORAS = {"zero", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte",
            "vinte e um", "vinte e dois", "vinte e três"};


    private static final String[] MINSEG = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte",
            "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro", "vinte e cinco", "vinte e seis",
            "vinte e sete", "vinte e oito", "vinte e nove", "trinta", "trinta e um", "trinta e dois",
            "trinta e três", "trinta e quatro", "trinta e cinco", "trinta e seis", "trinta e sete",
            "trinta e oito", "trinta e nove", "quarenta", "quarenta e um", "quarenta e dois", "quarenta e três",
            "quarenta e quatro", "quarenta e cinco", "quarenta e seis", "quarenta e sete", "quarenta e oito",
            "quarenta e nove", "cinquenta", "cinquenta e um", "cinquenta e dois", "cinquenta e três",
            "cinquenta e quatro", "cinquenta e cinco", "cinquenta e seis", "cinquenta e sete",
            "cinquenta e oito", "cinquenta e nove"};


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
        if(!this.setHora(h) || !this.setMinuto(m) || !this.setSegundo(s)){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
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

               StringBuilder sb = new StringBuilder();

               sb.append(HORAS[hora]);
               sb.append(" horas, ");
               sb.append(MINSEG[minuto]);
               sb.append(" minutos e ");
               sb.append(MINSEG[segundo]);
               sb.append(" segundos");


               return sb.toString();
        }


        public int emSegundos(){
        return this.segundo + this.minuto * 60 + this.hora * 60 * 60;
        }


        public  String diferenca(Horario outro){

        return "A distância entres as horas é: " + Math.abs(this.emSegundos() - outro.emSegundos());
        }


    // String.format

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
