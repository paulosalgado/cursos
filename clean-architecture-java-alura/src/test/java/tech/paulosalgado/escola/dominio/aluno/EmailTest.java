package tech.paulosalgado.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValidos() {

        Email email = new Email("pjosalgado@gmail.com");
        assertEquals("pjosalgado@gmail.com", email.getEndereco());

        Email emailComBr = new Email("pjosalgado@gmail.com.br");
        assertEquals("pjosalgado@gmail.com.br", emailComBr.getEndereco());
    }

}
