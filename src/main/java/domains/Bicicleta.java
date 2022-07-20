package domains;

import java.math.BigDecimal;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public Bicicleta(String marca, String modelo, BigDecimal preco, int ano) {
        super(marca, modelo, preco, ano);
    }
}
