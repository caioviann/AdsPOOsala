package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Double preco;
    private ArrayList<Autor> autores;
    private String isbn;

    public boolean addAutor(Autor a){
        return this.autores.add(a);
    }

    public Livro(String titulo, Double preco, ArrayList<Autor> autores, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", autores=" + autores +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
