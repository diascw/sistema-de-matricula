package models;

public class SistemaCobranca {
    public void gerarCobranca(Aluno aluno, Turma turma) {
        System.out.println("Gerando cobrança para o aluno " + aluno.getNome() + " na turma de " + turma.getDisciplina().getNome());
    }
}
