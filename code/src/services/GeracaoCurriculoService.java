package services;

import models.Secretaria;
import models.Turma;

import java.util.List;

public class GeracaoCurriculoService {
    private Secretaria secretaria = new Secretaria();

    public void gerarCurriculo(List<Turma> turmas) {
        secretaria.gerarCurriculoSemestral(turmas);
    }
}
