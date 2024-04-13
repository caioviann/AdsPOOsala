package ads.poo;

import java.time.LocalDate;

public class Aluno {
private String nome;
private String matricula;
private String curso;
private String telefone;
private String email;
private LocalDate dataDeNascimento;

    public Aluno(String nome, String matricula, String curso, String telefone, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
