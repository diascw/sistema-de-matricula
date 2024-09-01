package app;

import models.*;
import services.MatriculaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Turma> turmas = new ArrayList<>();
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

                scanner.nextLine();  // Consume newline
                System.out.print("Nome do Aluno: ");
                String nomeAluno = scanner.nextLine();
                System.out.print("Matrícula do Aluno: ");
                int matriculaAluno = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                System.out.print("Nome da Disciplina: ");
                String nomeDisciplina = scanner.nextLine();
                System.out.print("Créditos da Disciplina: ");
                int creditos = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                System.out.print("Nome do Professor: ");
                String nomeProfessor = scanner.nextLine();
                System.out.print("Departamento do Professor: ");
                String departamento = scanner.nextLine();
                System.out.print("Ano da Turma: ");
                int ano = scanner.nextInt();
                System.out.print("Semestre da Turma: ");
                int semestre = scanner.nextInt();

                Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
                Professor professor = new Professor(nomeProfessor, departamento);
                Disciplina disciplina = new Disciplina(nomeDisciplina, creditos);
                Turma turma = new Turma(disciplina, professor, ano, semestre);

                turmas.add(turma);

                matriculaService.matricularAluno(aluno, turma, isObrigatoria);
            } else if (opcao == 2) {
                // código para fechar período de matrículas...
            } else if (opcao == 3) {
                // código para visualizar alunos matriculados...
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
