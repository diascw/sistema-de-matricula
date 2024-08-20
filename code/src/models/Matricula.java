package models;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private Date dataMatricula;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.dataMatricula = new Date(); 
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno.getNome() +
                ", disciplina=" + disciplina.getNome() +
                ", dataMatricula=" + dataMatricula + 
                '}';
    }
}
