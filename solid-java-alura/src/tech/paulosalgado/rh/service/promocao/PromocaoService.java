package tech.paulosalgado.rh.service.promocao;

import tech.paulosalgado.rh.ValidacaoException;
import tech.paulosalgado.rh.model.Cargo;
import tech.paulosalgado.rh.model.Funcionario;

public class PromocaoService {

    public void promover(final Funcionario funcionario, final Boolean metaBatida) {

        final Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();

        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida) {
            final Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }

}
