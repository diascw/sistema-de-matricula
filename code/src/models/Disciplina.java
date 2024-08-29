package models;

public class Disciplina {
    private String nome;
    private int creditos;

    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }
}
