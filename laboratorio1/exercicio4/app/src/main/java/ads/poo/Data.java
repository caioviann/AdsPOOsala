package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this(1,1,1970);
    }

    public Data(int d) {
        this(d,1,1970);
    }

    public Data(int d, int m) {
        this(d,m,1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
