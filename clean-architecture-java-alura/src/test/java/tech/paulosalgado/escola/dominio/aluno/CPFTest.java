package tech.paulosalgado.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFsComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("cpf"));
    }

    @Test
    void deveriaCriarCPFComNumeroValido() {
        CPF cpf = new CPF("123.456.789-01");
        assertEquals("123.456.789-01", cpf.getNumero());
    }

}
