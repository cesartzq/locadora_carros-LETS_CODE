package heranca;

import java.math.BigDecimal;

import static heranca.PLRType.MULTIPLICADOR_PLR_ESTAGIARO;

public class Estagiario extends Funcionario {

    @Override
    public BigDecimal calcularPLR() {
        return getSalario().multiply(MULTIPLICADOR_PLR_ESTAGIARO.getMultiplicador());
    }

}
