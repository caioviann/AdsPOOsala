package org.example;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public StringBuilder toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("sigla: " + sigla + "\n") ;

        for(DiasDaSemana d : dias){
            sb.append( d.getExtenso() + "\n");
        }
        return sb;
    }
}
