
package ads.poo;

import java.util.Scanner;

public class Principal {
    int v;
    public static void main(String[] args) {
        Contador meuCont = new Contador();
        for (int i = 0; i < 100; i++) {
            meuCont.Incrementar();
            System.out.println("valor atual do contador: " + meuCont.getAtualValor());
        }



    }
}
