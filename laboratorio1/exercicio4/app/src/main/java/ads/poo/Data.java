package ads.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public final String[] EXTENSO = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

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
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
        if (dataValidate(dia,mes,ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }


    private boolean dataValidate(int dia, int mes, int ano){
        if (mes < 1 || mes > 12 || dia < 1 ||dia > 31|| ano < 1){
            return false;
        } else {
            int[] diasDoMes = {31, bissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return dia <= diasDoMes[mes -1];
        }

    }


    public boolean bissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0 || (ano % 400 == 0));
    }

    public boolean setDia(int d) {
        if (dataValidate(dia,mes,ano)){
            this.dia = d;
            return true;
        }
        return false;
    }

    public boolean setMes(int m) {
        if (dataValidate(dia,mes,ano)){
            this.mes = m;
            return true;
        }
        return false;
    }

    public boolean setAno(int a) {
        if (dataValidate(dia,mes,ano)){
            this.ano = a;
            return true;
        }
        return false;
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

    public String escreveExtenso(){
        String ext = EXTENSO[mes];
        return dia + " de " + ext + " " + ano;
    }

    public long diferenca(Data d){
        LocalDate dataPri = LocalDate.of(d.getAno(), d.getMes() , d.getDia());

        LocalDate dataSeg = LocalDate.of(ano, mes, dia);

        return  ChronoUnit.DAYS.between(dataPri, dataSeg);
    }


    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d", this.dia, this.mes, this.ano);
    }
}
