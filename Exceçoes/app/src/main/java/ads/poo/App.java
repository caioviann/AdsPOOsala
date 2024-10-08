/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;
        System.out.println("INICIO \n");
        try{
            System.out.print("Entre com o número: ");
            a = ler.nextInt();
            System.out.print("Entre com o número: ");
            b = ler.nextInt();
            int res = a / b;
            System.out.println(a + " dividindo por " + b + " = " + res);
        }catch (InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
            ler.nextLine();
        }catch (ArithmeticException e){
            System.err.println("calculo aritimético errado.");

        }catch (Exception e){
            System.err.println("Erro inesperado.");
        }
        System.out.println("FIM");

        lerTeclado();
    }

    public static int lerTeclado(){
        Scanner teclado = new Scanner(System.in);
        do{
            try{
                System.out.print("Entre com um número: ");
                int num = teclado.nextInt();
                return num;
            }catch(Exception e){
                System.err.println("Erro: " + e.toString());
            }finally{
                System.out.print("Sempre será executada");
            }
            System.out.print("Se o return for executado, então essa linha nunca será alcançada");
        }while(true);
    }
}
