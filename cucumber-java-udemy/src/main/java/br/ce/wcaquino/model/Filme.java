package br.ce.wcaquino.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Filme {

    private int estoque;
    private int aluguel;

}
