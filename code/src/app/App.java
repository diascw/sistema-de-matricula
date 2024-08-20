package app;

import models.Aluno;
import models.Disciplina;
import models.Matricula;
import models.Professor;
import models.SistemaCobranca;
import services.MatriculaService;

public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Cristiano Neto", "Computação");
        Disciplina disciplina = new Disciplina("Laboratório Desenvolvimento de Software", professor);
        
        Aluno aluno = new Aluno("Wanessa Dias", 815234);
        
        SistemaCobranca sistemaCobranca = new SistemaCobranca();
        MatriculaService matriculaService = new MatriculaService();
        
        Matricula matricula = matriculaService.matricularAluno(aluno, disciplina, sistemaCobranca);
        
        System.out.println("Matrícula criada: " + matricula);
    }
}
