
package ads.poo;

public class App {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerarCarro(100);
        System.out.println(c.getVelocidadeAtual());
        c.frearCarro(120);
        System.out.println(c.getVelocidadeAtual());
    }
}
