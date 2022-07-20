package validacoes;

import domains.Veiculo;

public class ValidaModelo implements Validador {
    @Override
    public boolean isValido(Veiculo veiculo) {
        return veiculo.getModelo() != null && !"".equals(veiculo.getModelo().strip());
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.MODELO;
    }
}
