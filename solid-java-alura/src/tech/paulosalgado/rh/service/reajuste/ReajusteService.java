package tech.paulosalgado.rh.service.reajuste;

import tech.paulosalgado.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    // Dependency Inversion Principle
    // reduzir acoplamento utilizando algo mais estável, como interfaces
    private final List<ValidacaoReajuste> validacoes;

    public ReajusteService(final List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(final Funcionario funcionario, final BigDecimal aumento) {

        // Open Closed Principle
        // cada validação fica em uma classe separada, utilizando uma abstração para acessá-las
        // abstrações não devem depender de implementações, e sim implementações depender de abstrações
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

        final BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
