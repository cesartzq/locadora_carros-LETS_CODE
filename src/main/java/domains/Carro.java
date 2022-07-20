package domains;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public Carro(String marca, String modelo, BigDecimal preco, int ano) {
        super(marca, modelo, preco, ano);
    }


}
