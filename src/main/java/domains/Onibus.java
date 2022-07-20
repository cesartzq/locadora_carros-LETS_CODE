package domains;

import java.math.BigDecimal;

public class Onibus extends Veiculo {

    public Onibus(String marca, String modelo) {
        super(marca, modelo);
    }

    public Onibus(String marca, String modelo, BigDecimal preco, int ano) {
        super(marca, modelo, preco, ano);
    }
}
