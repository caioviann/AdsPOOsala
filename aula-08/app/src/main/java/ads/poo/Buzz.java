package ads.poo;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto = false;
    private String[] frases = {"Ao infinito e além!","Nunca duvidei de mim mesmo, Comandante,e não vou começar agora!",
            "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
            "Preparando para voar!", "Comando estelar pronto para voar", "Consigo resolver todas as missões do universo"};
    private boolean asasAberta = false;

    public boolean isCapaceteAberto(){
        return capaceteAberto;
    }
    public boolean isFecharCapacete(){
        return capaceteAberto = true;
    }

    public boolean abrirFecharCapacete(){
        capaceteAberto = !capaceteAberto;
        return capaceteAberto;
    }
    public boolean abrirFecharAsas(){
        asasAberta = !asasAberta;
        return asasAberta;
    }

    public String dispararLaser(){
        return "Disparando laser";
    }

    public String frases(){
        Random aleatorio = new Random();
        return frases[aleatorio.nextInt(6)];
    }
    public String golpear(){
        return "Golpeando";
    }




}
