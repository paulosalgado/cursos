package tech.paulosalgado.escola.aplicacao.aluno.matricular;

import org.junit.jupiter.api.Test;
import tech.paulosalgado.escola.dominio.aluno.CPF;
import tech.paulosalgado.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {

        var repositorio = new RepositorioDeAlunosEmMemoria();
        var useCase = new MatricularAluno(repositorio);

        var alunoDTO = new MatricularAlunoDTO("Paulo",
                "123.456.789-00",
                "pjosalgado@gmail.com");

        useCase.executa(alunoDTO);

        var alunoEncontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("Paulo", alunoEncontrado.getNome());
        assertEquals("123.456.789-00", alunoEncontrado.getNumeroCpf());
        assertEquals("pjosalgado@gmail.com", alunoEncontrado.getEmail());
    }

}
