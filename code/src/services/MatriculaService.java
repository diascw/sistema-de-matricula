package services;

import models.Aluno;
import models.Disciplina;
import models.Matricula;
import models.SistemaCobranca;

public class MatriculaService {
    public Matricula matricularAluno(Aluno aluno, Disciplina disciplina, SistemaCobranca sistemaCobranca) {
        disciplina.matricularAluno(aluno);
        sistemaCobranca.gerarCobranca(aluno, disciplina);

        Matricula matricula = new Matricula(aluno, disciplina);
        System.out.println("Aluno matriculado com sucesso: " + matricula);
        
        return matricula;
    }
}
