
package ads.poo;

public class App {
    static Stack stack = new Stack(3);
    public static void main(String[] args) {

        Ball b = new Ball("Futebol", 12, 2, "Branca");

        try{


            stack.stackUp("primeiro");
            stack.stackUp("segundo");
            stack.stackUp("terceiro");

            System.out.println("Topo da pilha: " + stack.getElementTop());
            System.out.println("Desempilhando: " + stack.unstack());
            System.out.println("Topo da pilha atual: " + stack.unstack());

            System.out.println("A pilha está vazia ? " + StackFull());
            System.out.println("A pilha está cheia? " + StackFull());


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String StackFull(){
        if(stack.isFull() == true){
            return "Sim, A pilha está cheia";
        }else {
            return "Não, a pilha não está cheia";
        }
    }

    public static String StackEmpty(){
        if(stack.isEmpty() == true){
            return "Sim, A pilha está vázia";
        }else {
            return "Não, a pilha não está vázia";
        }
    }
}
