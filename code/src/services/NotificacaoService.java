package services;

import models.Aluno;
import models.SistemaCobranca;
import models.Turma;

public class NotificacaoService {

    private SistemaCobranca sistemaCobranca = new SistemaCobranca();

    public void notificarCobranca(Aluno aluno, Turma turma) {
        sistemaCobranca.gerarCobranca(aluno, turma);
    }
}
