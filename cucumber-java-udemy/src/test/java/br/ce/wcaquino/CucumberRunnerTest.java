package br.ce.wcaquino;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(

        /* onde estão as features */
        features = "src/test/resources/features/",

        /* onde estão os steps */
        glue = "br.ce.wcaquino.steps",

        /* pretty = imprime no log os testes realizados e pilha de erros */
        /* html = gera um html com os testes realizados, informando por parâmetro o local de salvamento */
        /* json = gera um json com os testes realizados, informando por parâmetro o local e nome do arquivo de salvamento */
        plugin = { "pretty", "html:target/report-html", "json:target/report.json" },

        /* não imprime colorido no log, o que facilita na análise */
        monochrome = true,

        /* apenas roda ou ignora testes específicos */
        tags = "~@ignore",

        /* gera os snnipets, no log, com camel case */
        snippets = CAMELCASE,

        /* se true valida apenas o mapeamento */
        dryRun = false,

        /* se true os passos da feature que não estão em steps disparam erro*/
        strict = false)

public class CucumberRunnerTest {

}
