package validacoes;


import domains.Carro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidaMarcaTest {

    @Test
    void validar() {
        Validador target = new ValidaMarca();

        final boolean resultado = target.isValido(new Carro("", ""));
        Assertions.assertFalse(resultado);
    }
}