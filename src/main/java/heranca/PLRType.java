package heranca;

import java.math.BigDecimal;

public enum PLRType {
    MULTIPLICADOR_PLR_GERENTE(4),
    MULTIPLICADOR_PLR_FUNCIONARIO(3),
    MULTIPLICADOR_PLR_ESTAGIARO(2);

    BigDecimal multiplicador;

    public BigDecimal getMultiplicador() {
        return multiplicador;
    }

    PLRType(Integer multiplicador) {
        this.multiplicador = BigDecimal.valueOf(multiplicador);
    }
}
