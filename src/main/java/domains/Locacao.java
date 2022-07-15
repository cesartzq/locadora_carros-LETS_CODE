package domains;

import comparators.MarcaComparator;
import comparators.PrecoComparator;
import exceptions.ParametroNaoInformadoException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.String.format;
import static validacoes.ValidacaoVeiculo.validaListaVeiculos;
import static validacoes.ValidacaoVeiculo.validaMarca;

public class Locacao {

    private List<Veiculo> veiculos;

    public Locacao(Veiculo... veiculos) {
        this.veiculos = new ArrayList();
        this.veiculos.addAll(Arrays.asList(veiculos));
    }

    public List disponiveis() {
        return veiculos;
    }

    public List buscaPorMarca(String marca) throws ParametroNaoInformadoException {
        validaMarca(marca);

        List<Veiculo> veiculosPorMarca = new ArrayList<>();
        for (Veiculo veiculo: veiculos) {
            if (marca.equalsIgnoreCase(veiculo.getMarca())) {
                veiculosPorMarca.add(veiculo);
            }
        }
        validaListaVeiculos(veiculosPorMarca, marca);
        return veiculosPorMarca;
    }

    public List<Veiculo> retornaOrdenadoMarca() {
        Collections.sort(veiculos, new MarcaComparator());
        return veiculos;
    }

    public List<Veiculo> retornaOrdenadoModelo() {
        Collections.sort(veiculos, new Comparator<Veiculo>() {
            @Override
            public int compare(Veiculo o1, Veiculo o2) {
                return o1.getModelo().compareTo(o2.getModelo());
            }
        });
        return veiculos;
    }

    public List<Veiculo> retornaOrdenadoAno() {
        Collections.sort(veiculos, new Comparator<Veiculo>() {
            @Override
            public int compare(Veiculo o1, Veiculo o2) {
                return Integer.compare(o2.getAno(), o1.getAno()) ;
            }
        });
        return veiculos;
    }

    public List<Veiculo> retornaOrdenadoPreco() {
        Collections.sort(veiculos, new PrecoComparator());
        return veiculos;
    }

    public void incluirVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

}

// VAR ARGS
//    public void recebeStrings(String meu1Elemento,
//                              String... outrosElementos) {
//        System.out.println(meu1Elemento);
//        System.out.println(Arrays.toString(outrosElementos));
//    }

