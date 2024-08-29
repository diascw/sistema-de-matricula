package models;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Turma turma;
    private Date dataMatricula;

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.dataMatricula = new Date();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }
}
