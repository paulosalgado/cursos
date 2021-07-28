package br.ce.wcaquino.steps;

import br.ce.wcaquino.model.Filme;
import br.ce.wcaquino.model.NotaAluguel;
import br.ce.wcaquino.model.TipoAluguel;
import br.ce.wcaquino.service.AluguelService;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import java.time.LocalDate;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class AlugarFilmeSteps {

    private AluguelService service = new AluguelService();

    private Filme filme;
    private NotaAluguel notaAluguel;
    private TipoAluguel tipoAluguel;

    private String excecao;

    @Dado("^um filme com estoque de (\\d+) unidades$")
    public void umFilmeComEstoqueDeUnidades(int arg1) {
        filme = Filme.builder()
                .estoque(arg1)
                .build();
    }

    @Dado("^que o preço do aluguel seja R\\$ (\\d+)$")
    public void queOPreçoDoAluguelSejaR$(int arg1) {
        filme.setAluguel(arg1);
    }

    @Quando("^alugar$")
    public void alugar() {
        try {
            notaAluguel = service.alugar(filme, tipoAluguel);
        } catch (Exception e) {
            excecao = e.getMessage();
        }
    }

    @Então("^o preço do aluguel será R\\$ (\\d+)$")
    public void oPreçoDoAluguelSeráR$(int arg1) {
        assertThat(arg1).isEqualTo(notaAluguel.getPreco());
    }

    @Então("^o estoque do filme será (\\d+) unidade$")
    public void oEstoqueDoFilmeSeráUnidade(int arg1) {
        assertThat(arg1).isEqualTo(filme.getEstoque());
    }

    @Então("^não será possível por falta de estoque$")
    public void nãoSeráPossívelPorFaltaDeEstoque() {
        assertThat("filme sem estoque").isEqualTo(excecao);
    }

    @Dado("^que o tipo do aluguel seja (comum|extendido|semanal)$")
    public void queOTipoDoAluguelSejaExtendido(String arg1) {
        tipoAluguel = TipoAluguel.valueOf(arg1.toUpperCase());
    }

    @Então("^a data de entrega será em (\\d+) dias?$")
    public void aDataDeEntregaSeráEmDias(int arg1) {

        LocalDate dataEntregaEsperada = LocalDate.now();
        dataEntregaEsperada.plusDays(arg1);

        assertThat(dataEntregaEsperada).isEqualTo(notaAluguel.getDataEntrega());
    }

    @Então("^a pontuação será de (\\d+) pontos?$")
    public void aPontuaçãoSeráDePontos(int arg1) {
        assertThat(arg1).isEqualTo(notaAluguel.getPontuacao());
    }

    @Dado("^um filme$")
    public void umFilme(DataTable arg1) {

        Map<String, String> map = arg1.asMap(String.class, String.class);

        filme = Filme.builder()
                .estoque(Integer.parseInt(map.get("estoque")))
                .aluguel(Integer.parseInt(map.get("preco")))
                .build();

        tipoAluguel = TipoAluguel.valueOf(map.get("tipo").toUpperCase());
    }

}
