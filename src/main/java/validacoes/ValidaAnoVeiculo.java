package validacoes;

import domains.Veiculo;

import java.time.Year;

public class ValidaAnoVeiculo implements Validador {
    @Override
    public boolean isValido(Veiculo veiculo) {
        final int ano = veiculo.getAno();
        return ano > 1960 && ano < Year.now().plusYears(1).getValue();
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.ANO;
    }
}
