package models;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private int MaxAluno = 60; 
    private int MinAluno = 3;   

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public boolean matricularAluno(Aluno aluno) {
        if (alunosMatriculados.size() < MaxAluno) { 
            alunosMatriculados.add(aluno);
            return true;
        }
        return false; 
    }

    public boolean verificarMinAluno() {
        return alunosMatriculados.size() >= MinAluno;
    }

    public boolean verificarMaxAluno() {
        return alunosMatriculados.size() >= MaxAluno;
    }
}
