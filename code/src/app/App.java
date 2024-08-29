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

        System.out.println("=== Sistema de Matrículas ===");

        
        System.out.print("Nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Departamento do professor: ");
        String departamentoProfessor = scanner.nextLine();
        Professor professor = new Professor(nomeProfessor, departamentoProfessor);

       
        System.out.print("Nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        System.out.print("Número de créditos: ");
        int numeroCreditos = scanner.nextInt();
        Disciplina disciplina = new Disciplina(nomeDisciplina, numeroCreditos);
        scanner.nextLine(); 

        System.out.print("Ano da turma: ");
        int ano = scanner.nextInt();
        System.out.print("Semestre da turma: ");
        int semestre = scanner.nextInt();
        Turma turma = new Turma(ano, semestre, disciplina, professor);

        System.out.print("Nome do aluno: ");
        scanner.nextLine(); 
        String nomeAluno = scanner.nextLine();
        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();
        Aluno aluno = new Aluno(nomeAluno, matricula);

        MatriculaService matriculaService = new MatriculaService();
        Matricula matriculaObj = matriculaService.matricularAluno(aluno, turma);

        if (matriculaObj != null) {
            System.out.println("Matrícula realizada com sucesso!");
        } else {
            System.out.println("Matrícula não realizada.");
        }

        SistemaCobranca sistemaCobranca = new SistemaCobranca();
        sistemaCobranca.gerarCobranca(aluno, turma);

        Secretaria secretaria = new Secretaria();
        List<Turma> turmas = new ArrayList<>();
        turmas.add(turma);

        SecretariaService secretariaService = new SecretariaService();
        secretariaService.gerarCurriculoSemestral(secretaria, turmas);
        
        scanner.close();
    }
}
