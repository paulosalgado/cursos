package tech.paulosalgado.escola.dominio.aluno;

// value object -> não possui identificador único
// dois telefones com o mesmo DDD e número são considerados iguais
public class Telefone {

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e número são obrigatórios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Número inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

}
