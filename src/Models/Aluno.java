package Models;

public class Aluno extends Usuario {
    private String curso;
    private int matricula;


    public Aluno(String nome, String login, String senha, String curso, int matricula) {
        super(nome, login, senha);
        this.curso = curso;
        this.matricula = matricula;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
