
package ads.poo;

public class App {

    public static void main(String[] args) {
//        Buzz b = new Buzz();
//
//        out.println(b.dispararLaser());
//
//        out.println("Capacete aberto? " + b.isCapaceteAberto());
//        b.isFecharCapacete();
//        out.println("Capacete aberto? " + b.isCapaceteAberto());

   //     Caneta c = new Caneta();
     //   c.setCor("verde");
//      Pessoa p = new Pessoa("Juca"," 123.456.789-00" ,"juca@gmail.com");
//
//      Caneta bic = new Caneta(100, "azul");
//      Caneta pilot = new Caneta("preta");
//      Caneta faberCastell = new Caneta();

        Formula1 carro = new Formula1(150);
        System.out.println("velocidade Atual: " + carro.getVelocidadeAtual());

        carro.acelerar(100);
        System.out.println("velocidade: " + carro.getVelocidadeAtual());
        carro.frear(300);
        System.out.println("velocidade Atual: " + carro.getVelocidadeAtual());



    }
}
