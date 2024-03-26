package ads.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;
    boolean ver;


    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int h) {
        if(h < 0 || h > 23) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }else {
            this.hora = h;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Horario(int h, int m) {
        if(h < 0 || h > 23 || m < 0 || m > 59){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }else {
            this.hora = h;
            this.minuto = m;
            this.segundo = 0;
        }
    }

    public Horario(int h, int m, int s) {
        if(h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }else {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
    }

    public void setHora(int h) {
        if(h < 0 || h > 23){
            ver = false;
        }else{
            this.hora = h;
            ver = true;
        }


    }

    public void setMinuto(int m) {
        if(m < 0 || m > 59){
            ver = false;
        }else{
            this.minuto = m;
            ver = true;
        }

    }

    public void setSegundo(int s) {
        if(s < 0 || s > 59){
            ver = false;
        }else{
            this.segundo = s;
            ver = true;
        }

    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
