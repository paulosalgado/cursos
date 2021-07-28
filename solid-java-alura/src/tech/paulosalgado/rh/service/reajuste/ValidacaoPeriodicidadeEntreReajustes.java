package tech.paulosalgado.rh.service.reajuste;

import tech.paulosalgado.rh.ValidacaoException;
import tech.paulosalgado.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    @Override
    public void validar(final Funcionario funcionario, final BigDecimal aumento) {

        final LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        final LocalDate dataAtual = LocalDate.now();
        final long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
        }
    }

}
