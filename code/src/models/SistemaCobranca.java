package models;

public class SistemaCobranca {
    public void gerarCobranca(Aluno aluno, Disciplina disciplina) {
        System.out.println("Gerando cobrança para o aluno " + aluno.getNome() + " na disciplina " + disciplina.getNome());
    }
}
