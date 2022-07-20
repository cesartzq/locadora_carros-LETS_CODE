package heranca;

import java.math.BigDecimal;

import static heranca.PLRType.MULTIPLICADOR_PLR_FUNCIONARIO;
import static java.math.BigDecimal.valueOf;

public abstract class Funcionario {

    private static final BigDecimal CALCULO_FERIAS = valueOf(0.3);

    private BigDecimal salario;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    BigDecimal calcularPLR() {
        return this.salario.multiply(MULTIPLICADOR_PLR_FUNCIONARIO.getMultiplicador());
    }

    BigDecimal calcularFerias() {
        return this.salario.multiply(CALCULO_FERIAS);
    }
}
