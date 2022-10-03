import Models.Aluno;
import Models.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "joao", "123", "ADS", 123);
        Professor professor = new Professor("Maria", "maria", "123");

        aluno.fazerLogin("joao", "12223");
        professor.fazerLogin("maria", "123");

        professor.publicarNota(aluno);
    }
}
