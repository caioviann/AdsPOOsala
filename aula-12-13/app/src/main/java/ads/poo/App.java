/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    Scanner teclado = new Scanner(System.in);


    private HashMap<String, Aluno> bancoDeDados;

    public App(){
        this.bancoDeDados = new HashMap<>();
    }

    private int menu(){
        int opcao = 0;
        System.out.println("..:: SIGAA 2 ::..");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar dados de um aluno");
        System.out.println("5 - Listar todos os alunos");
        System.out.println("6 - Sair");
        opcao = teclado.nextInt();
        teclado.nextLine();
        return opcao;
    }

    private void excluir(){
        System.out.println("Matrícula do aluno: ");
        String matricula = teclado.nextLine();
        if(this.bancoDeDados.remove(matricula) == null){
            System.out.println("Não encontrado");
        }else{
            System.out.println("removido com sucesso");
        }
    }

    private  boolean cadastrar(){
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a matricula: ");
        String matricula = teclado.nextLine();
        System.out.println("Digite o curso: ");
        String curso = teclado.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = teclado.nextLine();
        System.out.println("Digite o email: ");
        String email = teclado.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String dataString = teclado.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataString, formato);
        Aluno a = new Aluno(nome, matricula, curso, telefone, email, data);

        if(!bancoDeDados.containsKey((matricula))){
            this.bancoDeDados.put(matricula, a);

            return true;
        }
        return false;

    }

    private void listarTodos(){
        System.out.println(this.bancoDeDados);
    }
    private void listarDados() {
        System.out.println("Matrícula do aluno: ");
        String matricula = teclado.nextLine();
        if(bancoDeDados.get(matricula) != null){
            System.out.println(bancoDeDados.get(matricula));
        }else {
            System.out.println("Aluno não encontrado!");
        }


    }

    public static void main(String[] args) {


        App app = new App();
        int opcao;

        do{
            opcao = app.menu();

            switch (opcao) {
            case 1 -> app.cadastrar();
            case 2 -> System.out.println("Editando");
            case 3 -> app.excluir();
            case 4 -> app.listarDados();
            case 5 -> app.listarTodos();
            }
        }while (opcao != 6);

        System.out.println();
    }


}
