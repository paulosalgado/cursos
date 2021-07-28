package tech.paulosalgado.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("16", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("16", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("16", "123"));
    }

    @Test
    void deveriaCriarTelefoneComNumerosValidos() {

        Telefone telefoneComOitoDigitos = new Telefone("16", "12345678");
        assertEquals("16", telefoneComOitoDigitos.getDdd());
        assertEquals("12345678", telefoneComOitoDigitos.getNumero());

        Telefone telefoneComNoveDigitos = new Telefone("16", "123456789");
        assertEquals("16", telefoneComNoveDigitos.getDdd());
        assertEquals("123456789", telefoneComNoveDigitos.getNumero());
    }

}
