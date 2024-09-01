package models;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private int ano;
    private int semestre;
    private static final int LIMITE_MAX_ALUNOS = 60; 

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
        for (Aluno a : alunosMatriculados) {
            if (a.getMatricula() == aluno.getMatricula()) {
                return false;  
            }
        }

        if (alunosMatriculados.size() >= LIMITE_MAX_ALUNOS) {
            return false;  
        }
        
        alunosMatriculados.add(aluno);
        return true;  
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }
}
