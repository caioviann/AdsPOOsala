
package ads.poo;

public class App {

    public static void main(String[] args) {

        Ball b = new Ball("Futebol", 12, 2, "Branca");

        try{
            Stack stack = new Stack(3);

            stack.stackUp("primeiro");
            stack.stackUp("segundo");
            stack.stackUp("terceiro");

            System.out.println("Topo da pilha: " + stack.getElementTop());
            System.out.println("Desempilhando: " + stack.unstack());
            System.out.println("Topo da pilha atual: " + stack.unstack());
            System.out.println("A pilha está vazia ? " + stack.isEmpty());
            System.out.println("A pilha está cheia? " + stack.isFull());


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
