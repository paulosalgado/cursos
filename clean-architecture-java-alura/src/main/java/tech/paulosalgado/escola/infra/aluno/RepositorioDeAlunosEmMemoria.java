package tech.paulosalgado.escola.infra.aluno;

import tech.paulosalgado.escola.dominio.aluno.Aluno;
import tech.paulosalgado.escola.dominio.aluno.AlunoNaoEncontrado;
import tech.paulosalgado.escola.dominio.aluno.CPF;
import tech.paulosalgado.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private final List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getNumeroCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }

}
