package tech.paulosalgado.escola.infra.aluno;

import tech.paulosalgado.escola.dominio.aluno.CifradorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// service -> regra de negócio que não está faz parte de nenhuma envtidade ou VO
// se a regra faz parte de uma entidade ou VO ela deve ficar dentro da respectiva classe
public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

    @Override
    public String cifrarSenha(String senha) {
        try {
            var md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();

            return IntStream.range(0, bytes.length)
                    .mapToObj(i -> Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1))
                    .collect(Collectors.joining());

        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException("Erro ao gerar o hash da senha");
        }
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senha));
    }

}
