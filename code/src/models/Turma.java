package models;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int ano;
    private int semestre;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private final int minAlunos = 3;
    private final int maxAlunos = 60;

    public Turma(int ano, int semestre, Disciplina disciplina, Professor professor) {
        this.ano = ano;
        this.semestre = semestre;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
    }

    public boolean matricularAluno(Aluno aluno) {
        if (alunosMatriculados.size() < maxAlunos) {
            alunosMatriculados.add(aluno);
            return true;
        }
        return false;
    }

    public boolean verificarMinAlunos() {
        return alunosMatriculados.size() >= minAlunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
}
