package tech.paulosalgado.escola.aplicacao.indicacao;

import tech.paulosalgado.escola.dominio.aluno.Aluno;

// não é uma regra de negócio em si, por isso que está no pacote de aplicação e não no domínio
public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
