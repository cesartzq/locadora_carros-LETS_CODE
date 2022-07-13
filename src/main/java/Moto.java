import java.math.BigDecimal;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public Moto(String marca, String modelo, BigDecimal preco, int ano) {
        super(marca, modelo, preco, ano);
    }
}
