package models;

import java.util.List;

public class Secretaria {

    public void gerarCurriculoSemestral(List<Turma> turmas) {
        System.out.println("Gerando currículo semestral...");
        for (Turma turma : turmas) {
            System.out.println("Disciplina: " + turma.getDisciplina().getNome());
            System.out.println("Professor: " + turma.getProfessor().getNome());
            System.out.println("Número de Alunos: " + turma.getAlunosMatriculados().size());
            System.out.println("Ano: " + turma.getAno());
            System.out.println("Semestre: " + turma.getSemestre());
            System.out.println("-----------------------------------");
        }
    }

    public void fecharMatriculas(List<Turma> turmas) {
        System.out.println("Fechando matrículas...");
        for (Turma turma : turmas) {
            if (turma.verificarMinAlunos()) {
                System.out.println("Turma de " + turma.getDisciplina().getNome() + " será mantida.");
            } else {
                System.out.println("Turma de " + turma.getDisciplina().getNome() + " será cancelada pois o número mínimo de alunos não foi atingido.");
            }
        }
    }
}
