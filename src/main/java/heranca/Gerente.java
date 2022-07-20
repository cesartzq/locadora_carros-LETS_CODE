package heranca;

import java.math.BigDecimal;

import static heranca.PLRType.MULTIPLICADOR_PLR_ESTAGIARO;

public class Gerente extends Funcionario {

    public BigDecimal calcularPLR() {
        return getSalario().multiply(MULTIPLICADOR_PLR_ESTAGIARO.getMultiplicador());
    }

}
