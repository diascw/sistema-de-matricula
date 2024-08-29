package models;

import java.util.List;

public class Secretaria {

    public void fecharMatriculas(List<Turma> turmas) {
        for (Turma turma : turmas) {
            if (!turma.verificarMinAlunos()) {
                System.out.println("Turma de " + turma.getDisciplina().getNome() + " foi cancelada devido ao número insuficiente de alunos.");
            }
        }
    }

    public void gerarCurriculoSemestral(List<Turma> turmas) {
        System.out.println("=== Currículo Semestral ===");
        for (Turma turma : turmas) {
            System.out.println("Disciplina: " + turma.getDisciplina().getNome());
            System.out.println("Professor: " + turma.getProfessor().getNome());
            System.out.println("Ano: " + turma.getAno());
            System.out.println("Semestre: " + turma.getSemestre());
            System.out.println("Alunos Matriculados: " + turma.getAlunosMatriculados().size());
            System.out.println("--------------------------");
        }
    }
}
