package services;

import models.Aluno;
import models.Matricula;
import models.Turma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatriculaService {

    public Matricula matricularAluno(Aluno aluno, Turma turma, boolean isObrigatoria) {

        for (Turma t : aluno.getObrigatorias()) {
            if (t.getDisciplina().getNome().equals(turma.getDisciplina().getNome()) &&
                t.getAno() == turma.getAno() &&
                t.getSemestre() == turma.getSemestre()) {
                System.out.println("Falha na matrícula: Aluno já está matriculado nesta disciplina para o ano e semestre especificados.");
                return null;
            }
        }

        for (Turma t : aluno.getOptativas()) {
            if (t.getDisciplina().getNome().equals(turma.getDisciplina().getNome()) &&
                t.getAno() == turma.getAno() &&
                t.getSemestre() == turma.getSemestre()) {
                System.out.println("Falha na matrícula: Aluno já está matriculado nesta disciplina para o ano e semestre especificados.");
                return null;
            }
        }

        boolean matriculado;
        if (isObrigatoria) {
            matriculado = aluno.adicionarObrigatoria(turma);
            if (!matriculado) {
                System.out.println("O aluno já está matriculado em 4 disciplinas obrigatórias.");
                return null;
            }
        } else {
            matriculado = aluno.adicionarOptativa(turma);
            if (!matriculado) {
                System.out.println("O aluno já está matriculado em 2 disciplinas optativas.");
                return null;
            }
        }

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
            System.out.println("Falha na matrícula: limite de alunos foi atingido.");
            return null;
        }
    }

    private void salvarMatriculaEmArquivo(Matricula matricula) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHora = dateFormat.format(new Date());

        try (PrintWriter writer = new PrintWriter(new FileWriter("matriculas.txt", true))) {
            writer.println("Aluno: " + matricula.getAluno().getNome());
            writer.println("Matrícula do Aluno: " + matricula.getAluno().getMatricula());
            writer.println("Turma: " + matricula.getTurma().getDisciplina().getNome());
            writer.println("Professor: " + matricula.getTurma().getProfessor().getNome());
            writer.println("Data e Hora: " + dataHora);
            writer.println("-----------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
