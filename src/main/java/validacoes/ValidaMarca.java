package validacoes;

import domains.Veiculo;

public class ValidaMarca implements Validador {
    @Override
    public boolean isValido(Veiculo veiculo) {
        return veiculo.getMarca() != null && !"".equals(veiculo.getMarca().strip());
    }

    @Override
    public ValidacaoType getValidacaoType() {
        return ValidacaoType.MARCA;
    }
}
