package tech.paulosalgado.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosPessoais {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(final Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(final BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(final LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

}
