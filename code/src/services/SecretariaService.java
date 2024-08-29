package services;

import models.Secretaria;
import models.Turma;

import java.util.List;

public class SecretariaService {

    public void gerarCurriculoSemestral(Secretaria secretaria, List<Turma> turmas) {
        secretaria.fecharMatriculas(turmas);
    }
}
