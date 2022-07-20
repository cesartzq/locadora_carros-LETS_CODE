import java.math.BigDecimal;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        Veiculo fuscao = new Carro("Volks","Fuscao", BigDecimal.valueOf(15_000), 1980);
        Veiculo lamborghini = new Carro("Lamborghini","Aventator", BigDecimal.valueOf(250_000), 2010);
        Veiculo onibus = new Onibus("Mercedes", "Busao", BigDecimal.valueOf(150_000), 2005);
        Veiculo tesla = new Carro("Tesla","XYZ", BigDecimal.valueOf(200_000), 2015);

        final Object novoFusca = fuscao.clone();

        System.out.println(" fusca normal: " + fuscao);
        System.out.println("Novo fusca: " + novoFusca);

        Comparator<Veiculo> comparaMarcaModeloPreco =
                Comparator
                        .comparing(Veiculo::getMarca)
                        .thenComparing(Veiculo::getModelo)
                        .thenComparing(Veiculo::getPreco, Comparator.nullsLast(Comparator.naturalOrder()));

        Locacao locacao = new Locacao(comparaMarcaModeloPreco, fuscao,
                lamborghini, onibus, tesla);

        final Collection disponiveis = locacao.disponiveis();

        System.out.println(disponiveis);
        System.out.println(disponiveis.size());

        locacao.incluirVeiculo(new Bicicleta("Caloi", "Ceci"));
        locacao.incluirVeiculo(new Bicicleta("Caloi", "Ceci"));

        System.out.println(disponiveis);
        System.out.println(disponiveis.size());

        final Collection naoOrdenado = locacao.disponiveis();

        System.out.println("Nao Ordenada" + naoOrdenado);

        // Comparator serve para comparar cada elemento de uma lista (pode ter múltiplas implementações)
        // Comparable com compareTo seria utilizado para comparar objeto (único)

//        final List<Veiculo> ordenadoPorMarca = locacao.retornaOrdenadoMarca();
//        System.out.println("Ordenado por Marca" + ordenadoPorMarca);
//
//        final List<Veiculo> ordenadoPorModelo = locacao.retornaOrdenadoModelo();
//        System.out.println("Ordenado por Modelo" + ordenadoPorModelo);
//
//        final List<Veiculo> ordenadoPorPreco = locacao.retornaOrdenadoPreco();
//        System.out.println("Ordenado por Preço" + ordenadoPorPreco);
//
//        final List<Veiculo> ordenadoPorAno = locacao.retornaOrdenadoAnoDecrescente();
//        System.out.println("Ordenado por Ano" + ordenadoPorAno);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite a marca");
//        final String marca = scanner.nextLine();
//        List buscaPorMarca = null;
//        try {
//            buscaPorMarca = locacao.buscaPorMarca(marca);
//        } catch (ParametroNaoInformadoException ex) {
//            System.out.println("Parametro nao encontrado");
//        } finally {
//            scanner.close();
//        }

//        System.out.println(buscaPorMarca);
//
    }


}
