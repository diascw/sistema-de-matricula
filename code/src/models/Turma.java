package models;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private int ano;
    private int semestre;

    public Turma(Disciplina disciplina, Professor professor, int ano, int semestre) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.ano = ano;
        this.semestre = semestre;
        this.alunosMatriculados = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public boolean verificarMinAlunos() {
        return alunosMatriculados.size() >= 3; 
    }

    public boolean matricularAluno(Aluno aluno) {
        if (!alunosMatriculados.contains(aluno)) {
            alunosMatriculados.add(aluno);
            return true;
        }
        return false; 
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }
}
