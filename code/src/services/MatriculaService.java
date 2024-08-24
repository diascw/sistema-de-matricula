package services;

import models.Aluno;
import models.Disciplina;
import models.Matricula;

public class MatriculaService {
    public Matricula matricularAluno(Aluno aluno, Disciplina disciplina) {
        boolean sucesso = disciplina.matricularAluno(aluno);

        if (sucesso) {
            Matricula matricula = new Matricula(aluno, disciplina);

            if (disciplina.verificarMinAluno()) {
                System.out.println("Mínimo de alunos atingido. A disciplina será ativada.");
            } else {
                System.out.println("Atenção: o mínimo de alunos ainda não foi atingido.");
            }

            return matricula;
        } else {
            System.out.println("Falha na matrícula: limite de alunos atingido.");
            return null;
        }
    }
}
