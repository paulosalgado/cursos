package br.ce.wcaquino.steps;

import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import br.ce.wcaquino.transformers.LocalDateTransformer;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class EntregaSteps {

    private LocalDate date;

    @Dado("^que a entrega é dia (.*)$")
    public void queAEntregaÉDia(@Transform(LocalDateTransformer.class) LocalDate arg1) {
        date = arg1;
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mês|meses|ano|anos)$")
    public void aEntregaAtrasarEm(int arg1, String arg2) {

        switch (arg2) {
            case "dia":
            case "dias":
                date = date.plusDays(arg1);
                break;
            case "mês":
            case "meses":
                date = date.plusMonths(arg1);
                break;
            case "ano":
            case "anos":
                date = date.plusYears(arg1);
                break;
        }
    }

    @Então("^a entrega será efetuada em (.*)$")
    public void aEntregaSeráEfetuadaEm(@Transform(LocalDateTransformer.class) LocalDate arg1) {
        assertThat(date).isEqualTo(arg1);
    }

}
