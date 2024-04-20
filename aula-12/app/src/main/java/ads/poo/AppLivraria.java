package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {
    private HashMap<String, Livro> livros;

    public AppLivraria(){
        this.livros = new HashMap<>();
    }

    public static void main(String[] args) {

        ArrayList<Autor> autor1 = new ArrayList<>();
        autor1.add(new Autor("caio", "Brasil"));
        Livro l1 = new Livro("It a coisa",59.00,autor1,"121312");

        ArrayList<Autor> autor2 = new ArrayList<>();
        autor1.add(new Autor("Henrique", "portugal"));
        Livro l2 = new Livro("ABD",59.00,autor2,"12634632");

        ArrayList<Autor> autor3 = new ArrayList<>();
        autor1.add(new Autor("Nunes", "espanha"));
        Livro l3 = new Livro("HFWIAGFIP",59.00,autor3,"15151");

        AppLivraria app = new AppLivraria();

        System.out.println(app.livros.toString());
    }
}
