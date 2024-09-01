package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Turma> obrigatorias;
    private List<Turma> optativas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.obrigatorias = new ArrayList<>();
        this.optativas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public List<Turma> getObrigatorias() {
        return obrigatorias;
    }

    public List<Turma> getOptativas() {
        return optativas;
    }

    public boolean adicionarObrigatoria(Turma turma) {
        if (obrigatorias.size() < 4) {
            obrigatorias.add(turma);
            return true;
        }
        return false;
    }

    public boolean adicionarOptativa(Turma turma) {
        if (optativas.size() < 2) {
            optativas.add(turma);
            return true;
        } else {
            System.out.println("Limite de 2 disciplinas optativas atingido.");
            return false;
        }
    }
    
}
