package br.ce.wcaquino.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static org.assertj.core.api.Assertions.assertThat;

public class ContadorSteps {

    private int contador;

    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(int arg1) {
        contador = arg1;
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) {
        contador += arg1;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSerá(int arg1) {
        assertThat(contador).isEqualTo(arg1);
    }

}
