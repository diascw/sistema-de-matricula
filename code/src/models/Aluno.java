package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Turma> disciplinasObrigatorias;
    private List<Turma> disciplinasOptativas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasObrigatorias = new ArrayList<>();
        this.disciplinasOptativas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean matricularDisciplinaObrigatoria(Turma turma) {
        if (disciplinasObrigatorias.size() < 4 && turma.matricularAluno(this)) {
            disciplinasObrigatorias.add(turma);
            return true;
        }
        return false;
    }

    public boolean matricularDisciplinaOptativa(Turma turma) {
        if (disciplinasOptativas.size() < 2 && turma.matricularAluno(this)) {
            disciplinasOptativas.add(turma);
            return true;
        }
        return false;
    }

    public void cancelarMatricula(Turma turma) {
        if (disciplinasObrigatorias.contains(turma)) {
            disciplinasObrigatorias.remove(turma);
        } else if (disciplinasOptativas.contains(turma)) {
            disciplinasOptativas.remove(turma);
        }
        turma.removerAluno(this);
    }
}
