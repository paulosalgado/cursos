package tech.paulosalgado.rh.model;

public class Terceirizado {

    // Liskov Substitution Principle
    // favorecer a composição ao invés da herança; se Terceirizado estendesse Funcionario teria comportamentos que não fariam sentido
    private DadosPessoais dadosPessoais;

    private String empresa;

    public Terceirizado(final DadosPessoais dadosPessoais, final String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(final DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(final String empresa) {
        this.empresa = empresa;
    }

}
