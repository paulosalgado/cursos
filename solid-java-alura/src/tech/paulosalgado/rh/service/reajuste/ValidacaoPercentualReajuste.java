package tech.paulosalgado.rh.service.reajuste;

import tech.paulosalgado.rh.ValidacaoException;
import tech.paulosalgado.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    @Override
    public void validar(final Funcionario funcionario, final BigDecimal aumento) {

        final BigDecimal salario = funcionario.getDadosPessoais().getSalario();
        final BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste não pode ser superior a 40% do salário!");
        }
    }

}
