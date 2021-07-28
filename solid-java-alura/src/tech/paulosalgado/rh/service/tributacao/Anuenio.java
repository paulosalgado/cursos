package tech.paulosalgado.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

// Interface Segregation Principle
// reajuste anuênio não tem valor de imposto de renda, então não deve ser obrigado a implementar o cálculo
public class Anuenio implements Reajuste {

    private final BigDecimal valor;
    private final LocalDate data;

    public Anuenio(final BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

}
