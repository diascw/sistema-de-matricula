package services;

import models.Aluno;
import models.Disciplina;
import models.Matricula;

public class MatriculaService {
    public Matricula matricularAluno(Aluno aluno, Disciplina disciplina) {
        boolean sucesso = disciplina.matricularAluno(aluno);

        if (sucesso) {
            return new Matricula(aluno, disciplina);
        } else {
            System.out.println("Falha na matrícula: limite de alunos atingido.");
            return null;
        }
    }
}
