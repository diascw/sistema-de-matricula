package models;

import java.util.List;

public class Professor {
    private String nome;
    private String departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void consultarAlunosMatriculados(Turma turma) {
        System.out.println("Alunos matriculados na disciplina " + turma.getDisciplina().getNome() + ":");
        List<Aluno> alunos = turma.getAlunosMatriculados();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
