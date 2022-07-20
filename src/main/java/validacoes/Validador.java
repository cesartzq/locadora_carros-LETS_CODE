package validacoes;

import domains.Veiculo;

public interface Validador {

    boolean isValido(Veiculo veiculo);

    ValidacaoType getValidacaoType();
}
