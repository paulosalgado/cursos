package tech.paulosalgado.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

// entity -> possui identificador único
// dois alunos com nome e e-mail iguais não necessariamente são a mesma pessoa
public class Aluno {

    private final CPF cpf;
    private final String nome;
    private final Email email;
    private final List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNumeroCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

}
