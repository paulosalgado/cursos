package br.ce.wcaquino.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class NotaAluguel {

    private int preco;
    private LocalDate dataEntrega;
    private int pontuacao;

}
