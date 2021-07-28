package tech.paulosalgado.escola.aplicacao.aluno.matricular;

import tech.paulosalgado.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // padrão Command
    public void executa(MatricularAlunoDTO dados) {
        var aluno = dados.criarAluno();
        this.repositorio.matricular(aluno);
    }

}
