package tech.paulosalgado.rh.service.reajuste;

import tech.paulosalgado.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(final Funcionario funcionario, final BigDecimal aumento);

}
