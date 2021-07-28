package br.ce.wcaquino.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoAluguel {

    COMUM (1, 1, 1),
    EXTENDIDO (3, 2, 2),
    SEMANAL (7, 3, 3);

    int qtdDiasEntrega;
    int multiplicadorValor;
    int pontuacao;

}
