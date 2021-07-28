package br.ce.wcaquino.service;

import br.ce.wcaquino.model.Filme;
import br.ce.wcaquino.model.NotaAluguel;
import br.ce.wcaquino.model.TipoAluguel;

import java.time.LocalDate;

public class AluguelService {

    public NotaAluguel alugar(Filme filme, TipoAluguel tipo) {

        if (filme.getEstoque() == 0) {
            throw new RuntimeException("filme sem estoque");
        }

        filme.setEstoque(filme.getEstoque() - 1);

        LocalDate dataEntrega = LocalDate.now();
        dataEntrega.plusDays(tipo.getQtdDiasEntrega());

        return NotaAluguel.builder()
                .preco(filme.getAluguel() * tipo.getMultiplicadorValor())
                .dataEntrega(dataEntrega)
                .pontuacao(tipo.getPontuacao())
                .build();
    }

}
