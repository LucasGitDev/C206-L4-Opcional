package Models;

import Interfaces.Funcionario;

public class Professor extends Usuario implements Funcionario {

    private boolean autenticado;
    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void fazerLogin(String login, String senha) {
        if (this.autenticado) {
            System.out.println("Você já está logado");
            return;
        } else {
            this.autenticado = this.autenticar(senha);
            if (autenticado && this.login.equals(login)) {
                System.out.println("Login realizado");
            } else {
                System.out.println("Login ou senha incorretos");
            }
        }

    }

    public void publicarNota(Aluno aluno) {
        if (this.autenticado) {
            System.out.println("Nota publicada para o aluno " + aluno.getNome());
        } else {
            System.out.println("Você não está logado");
        }
    }
}
