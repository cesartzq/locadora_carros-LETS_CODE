package domains;

import exceptions.ParametroNaoInformadoException;
import validacoes.ValidacaoVeiculo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Locacao {

    private final Collection<Veiculo> veiculos;

    private final ValidacaoVeiculo validacaoVeiculo;

    public Locacao(Comparator comparator, ValidacaoVeiculo validacaoVeiculo) {
        this.veiculos = new TreeSet<>(comparator);
        this.validacaoVeiculo = validacaoVeiculo;
    }

    public Collection<Veiculo> disponiveis() {
        return veiculos;
    }

    public Collection<Veiculo> buscaPorMarca(String marca) throws ParametroNaoInformadoException {

        List<Veiculo> veiculosPorMarca = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (marca.equalsIgnoreCase(veiculo.getMarca())) {
                veiculosPorMarca.add(veiculo);
            }
        }
        return veiculosPorMarca;
    }

    public void incluirVeiculo(Veiculo veiculo) {
        validacaoVeiculo.executar(veiculo);
        veiculos.add(veiculo);
    }

}

// VAR ARGS
//    public void recebeStrings(String meu1Elemento,
//                              String... outrosElementos) {
//        System.out.println(meu1Elemento);
//        System.out.println(Arrays.toString(outrosElementos));
//    }

