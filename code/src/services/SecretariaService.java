package services;

import models.Secretaria;
import models.Turma;

import java.util.List;

public class SecretariaService {
    public void fecharMatriculas(Secretaria secretaria, List<Turma> turmas) {
        secretaria.fecharMatriculas(turmas);
    }

    public void gerarCurriculoSemestral(Secretaria secretaria, List<Turma> turmas) {
        secretaria.gerarCurriculoSemestral(turmas);
    }
}
