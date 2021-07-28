package tech.paulosalgado.escola.infra.aluno;

import tech.paulosalgado.escola.dominio.aluno.Aluno;
import tech.paulosalgado.escola.dominio.aluno.AlunoNaoEncontrado;
import tech.paulosalgado.escola.dominio.aluno.CPF;
import tech.paulosalgado.escola.dominio.aluno.RepositorioDeAlunos;
import tech.paulosalgado.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            var sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, aluno.getNumeroCpf());
            statement.setString(2, aluno.getNome());
            statement.setString(3, aluno.getEmail());
            statement.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";
            statement = connection.prepareStatement(sql);

            for (Telefone telefone : aluno.getTelefones()) {
                statement.setString(1, telefone.getDdd());
                statement.setString(2, telefone.getNumero());
                statement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        // ToDo: implementar
        throw new AlunoNaoEncontrado(cpf);
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        // ToDo: implementar
        return Collections.emptyList();
    }

}
