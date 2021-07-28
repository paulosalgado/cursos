package tech.paulosalgado.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    private DadosPessoais dadosPessoais;
    private LocalDate dataUltimoReajuste;

    public Funcionario(final DadosPessoais dadosPessoais, final LocalDate dataUltimoReajuste) {
        this.dadosPessoais = dadosPessoais;
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    // Single Responsibility Principle
    // a regra de reajuste de salário não é de responsabilidade da classe Funcionario
    public void atualizarSalario(final BigDecimal novoSalario) {
        this.dadosPessoais.setSalario(novoSalario);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(final DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(final LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public void promover(final Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

}
