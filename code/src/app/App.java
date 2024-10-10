package app;

import models.*;
import services.MatriculaService;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Turma> turmas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        MatriculaService matriculaService = new MatriculaService();

        while (true) {
            System.out.println("1. Adicionar nova matrícula");
            System.out.println("2. Fechar período de matrículas");
            System.out.println("3. Visualizar alunos matriculados (Professor)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("1ª opção (Obrigatória) ou 2ª opção (Optativa)? (Digite 1 ou 2): ");
                int tipo = scanner.nextInt();
                boolean isObrigatoria = tipo == 1;

                scanner.nextLine();
                System.out.print("Nome do Aluno: ");
                String nomeAluno = scanner.nextLine();
                System.out.print("Matrícula do Aluno: ");
                int matriculaAluno = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome da Disciplina: ");
                String nomeDisciplina = scanner.nextLine();
                System.out.print("Créditos da Disciplina: ");
                int creditos = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do Professor: ");
                String nomeProfessor = scanner.nextLine();
                System.out.print("Departamento do Professor: ");
                String departamento = scanner.nextLine();
                System.out.print("Ano da Turma: ");
                int ano = scanner.nextInt();
                System.out.print("Semestre da Turma: ");
                int semestre = scanner.nextInt();

                Aluno aluno = null;
                for (Aluno a : alunos) {
                    if (a.getMatricula() == matriculaAluno) {
                        aluno = a;
                        break;
                    }
                }

                if (aluno == null) {
                    aluno = new Aluno(nomeAluno, matriculaAluno);
                    alunos.add(aluno);
                }

                Professor professor = new Professor(nomeProfessor, departamento);
                Disciplina disciplina = new Disciplina(nomeDisciplina, creditos);
                Turma turma = new Turma(disciplina, professor, ano, semestre);

                turmas.add(turma);

                Matricula matricula = matriculaService.matricularAluno(aluno, turma, isObrigatoria);

                if (matricula == null && !isObrigatoria) {
                    System.out.println("Falha na matrícula: O aluno já está matriculado em 2 disciplinas optativas.");
                }
            } else if (opcao == 2) {
                System.out.println("Período de matrículas fechado.");
                gerarRelatorioMatriculas(turmas);
            } else if (opcao == 3) {
                scanner.nextLine();
                System.out.print("Nome da Disciplina para consulta: ");
                String nomeDisciplinaConsulta = scanner.nextLine();

                for (Turma t : turmas) {
                    if (t.getDisciplina().getNome().equalsIgnoreCase(nomeDisciplinaConsulta)) {
                        System.out.println("Alunos matriculados na disciplina " + nomeDisciplinaConsulta + ":");
                        for (Aluno a : t.getAlunosMatriculados()) {
                            System.out.println("- " + a.getNome() + " (Matrícula: " + a.getMatricula() + ")");
                        }
                    }
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void gerarRelatorioMatriculas(List<Turma> turmas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("relatorio_matriculas.txt", true))) {
            for (Turma t : turmas) {
                boolean ativada = t.verificarMinAlunos();
                writer.println("Turma: " + t.getDisciplina().getNome() + " - Professor: " + t.getProfessor().getNome());
                writer.println("Status da turma: " + (ativada ? "Ativada" : "Não Ativada"));
                writer.println("Alunos matriculados:");
                for (Aluno a : t.getAlunosMatriculados()) {
                    writer.println("- " + a.getNome() + " (Matrícula: " + a.getMatricula() + ")");
                }
                writer.println("-------------------------------------");
            }
            System.out.println("Relatório de matrículas gerado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gerar o relatório de matrículas.");
            e.printStackTrace();
        }
    }
}
