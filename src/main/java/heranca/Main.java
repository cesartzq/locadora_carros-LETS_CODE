package heranca;


import static java.math.BigDecimal.valueOf;

public class Main {

    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario();
        estagiario.setSalario(valueOf(800));
        System.out.println("Estagiario: " + estagiario.calcularPLR());

        Funcionario gerente = new Gerente();
        gerente.setSalario(valueOf(15000));
        System.out.println("Gerente: " + gerente.calcularPLR());
    }
}
