package app;

import models.*;
import services.MatriculaService;
import services.SecretariaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Turma> turmas = new ArrayList<>();
        MatriculaService matriculaService = new MatriculaService();
        SecretariaService secretariaService = new SecretariaService();
        Secretaria secretaria = new Secretaria();  

        while (true) {
            System.out.println("1. Adicionar nova matrícula");
            System.out.println("2. Fechar período de matrículas");
            System.out.println("3. Visualizar alunos matriculados");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            if (opcao == 1) {
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
                scanner.nextLine();  

                Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

                Turma turmaExistente = null;
                for (Turma turma : turmas) {
                    if (turma.getDisciplina().getNome().equals(nomeDisciplina)
                        && turma.getProfessor().getNome().equals(nomeProfessor)
                        && turma.getAno() == ano
                        && turma.getSemestre() == semestre) {
                        turmaExistente = turma;
                        break;
                    }
                }

                if (turmaExistente == null) {
                    Professor professor = new Professor(nomeProfessor, departamento);
                    Disciplina disciplina = new Disciplina(nomeDisciplina, creditos);
                    turmaExistente = new Turma(disciplina, professor, ano, semestre);
                    turmas.add(turmaExistente);
                }

                boolean sucesso = turmaExistente.matricularAluno(aluno);
                if (sucesso) {
                    matriculaService.matricularAluno(aluno, turmaExistente);
                }

            } else if (opcao == 2) {
                secretariaService.gerarCurriculoSemestral(secretaria, turmas);
            } else if (opcao == 3) {
                System.out.print("Nome do Professor: ");
                String nomeProfessor = scanner.nextLine();
                System.out.print("Nome da Disciplina: ");
                String nomeDisciplina = scanner.nextLine();
                
                Turma turmaEncontrada = null;
                for (Turma turma : turmas) {
                    if (turma.getProfessor().getNome().equals(nomeProfessor) &&
                        turma.getDisciplina().getNome().equals(nomeDisciplina)) {
                        turmaEncontrada = turma;
                        break;
                    }
                }

                if (turmaEncontrada != null) {
                    System.out.println("Alunos matriculados na disciplina " + nomeDisciplina + " do professor " + nomeProfessor + ":");
                    for (Aluno aluno : turmaEncontrada.getAlunosMatriculados()) {
                        System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
                    }
                } else {
                    System.out.println("Turma não encontrada ou nenhum aluno matriculado.");
                }

            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
