package br.ce.wcaquino.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberSteps {

    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() { }

    @Quando("^executá-lo$")
    public void executáLo() { }

    @Então("^a especificação deve finalizar com sucesso$")
    public void aEspecificaçãoDeveFinalizarComSucesso() { }

    @Dado("^que o ticket( especial)? é (A.\\d{3})$")
    public void queOTicket(String arg1, String arg2) { }

    @Dado("^que o valor da passagem é R\\$ (.*)$")
    public void queOValorDaPassagemÉR$(Double arg1) { }

    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void queONomeDoPassageiroÉ(String arg1) { }

    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void queOTelefoneDoPassageiroÉ(String arg1) { }

    @Quando("^criar os steps$")
    public void criarOsSteps() { }

    @Então("^o teste vai funcionar$")
    public void oTesteVaiFuncionar() { }

}
