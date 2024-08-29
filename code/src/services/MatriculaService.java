package services;

import models.Aluno;
import models.Matricula;
import models.Turma;

import java.io.FileWriter;
import java.io.IOException;

public class MatriculaService {
    public Matricula matricularAluno(Aluno aluno, Turma turma) {
        boolean sucesso = turma.matricularAluno(aluno);

        if (sucesso) {
            Matricula matricula = new Matricula(aluno, turma);

            if (turma.verificarMinAlunos()) {
                System.out.println("Mínimo de alunos atingido. A turma será ativada.");
            } else {
                System.out.println("Atenção: o mínimo de alunos ainda não foi atingido.");
            }

            salvarMatriculaEmArquivo(matricula);
            return matricula;
        } else {
            System.out.println("Falha na matrícula: limite de alunos atingido.");
            return null;
        }
    }

    private void salvarMatriculaEmArquivo(Matricula matricula) {
        try (FileWriter writer = new FileWriter("matriculas.txt", true)) {
            writer.write("Aluno: " + matricula.getAluno().getNome() + ", Disciplina: " + matricula.getTurma().getDisciplina().getNome() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
