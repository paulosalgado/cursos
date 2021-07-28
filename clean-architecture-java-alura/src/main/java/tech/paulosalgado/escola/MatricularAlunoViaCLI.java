package tech.paulosalgado.escola;

import tech.paulosalgado.escola.aplicacao.aluno.matricular.MatricularAluno;
import tech.paulosalgado.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import tech.paulosalgado.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaCLI {

    public static void main(String[] args) {

        var nome = "Paulo";
        var cpf = "123.456.789-00";
        var email = "pjosalgado@gmail.com";
        var dto = new MatricularAlunoDTO(nome, cpf, email);

        var matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(dto);
    }

}
