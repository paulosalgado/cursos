package tech.paulosalgado.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

    private final BigDecimal valor;
    private final LocalDate data;

    public Promocao(final BigDecimal valor) {
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

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return this.valor.multiply(new BigDecimal("0.1"));
    }

}
