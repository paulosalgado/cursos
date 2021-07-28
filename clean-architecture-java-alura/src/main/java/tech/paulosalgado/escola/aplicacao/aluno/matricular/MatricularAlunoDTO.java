package tech.paulosalgado.escola.aplicacao.aluno.matricular;

import tech.paulosalgado.escola.dominio.aluno.Aluno;
import tech.paulosalgado.escola.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDTO {

    private final String nomeAluno;
    private final String cpfAluno;
    private final String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new FabricaDeAluno()
                .comNomeCPFEmail(this.nomeAluno, this.cpfAluno, this.emailAluno)
                .criar();
    }

}
