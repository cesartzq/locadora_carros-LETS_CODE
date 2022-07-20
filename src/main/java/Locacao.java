import exceptions.ParametroNaoInformadoException;

import java.util.*;

import static java.lang.String.format;
import static validacoes.ValidacaoVeiculo.validaListaVeiculos;
import static validacoes.ValidacaoVeiculo.validaMarca;

public class Locacao {

    private Collection<Veiculo> veiculos;

    public Locacao(Comparator<Veiculo> comparator, Veiculo... veiculos) {
        this.veiculos = new TreeSet<>(comparator);
        this.veiculos.addAll(Arrays.asList(veiculos));
    }

    public Collection<Veiculo> disponiveis() {
        return veiculos;
    }

    public Collection<Veiculo> buscaPorMarca(String marca) throws ParametroNaoInformadoException {
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

//    public List<Veiculo> retornaOrdenadoMarca() {
//        Collections.sort(veiculos, new MarcaComparator());
//        return veiculos;
//    }
//
//    public List<Veiculo> retornaOrdenadoModelo() {
//        Collections.sort(veiculos, new Comparator<Veiculo>() {
//            @Override
//            public int compare(Veiculo o1, Veiculo o2) {
//                return o1.getModelo().compareTo(o2.getModelo());
//            }
//        });
//        return veiculos;
//    }
//
//    public List<Veiculo> retornaOrdenadoPreco() {
//        veiculos.sort((v1, v2) -> {
//            if (v1.getPreco() == null)
//                return -1;
//            if (v2.getPreco() == null)
//                return 1;
//            return v1.getPreco().compareTo(v2.getPreco());
//        });
//        return veiculos;
//    }
//
//    public List<Veiculo> retornaOrdenadoAnoDecrescente() {
//        veiculos.sort(new Comparator<Veiculo>() {
//            @Override
//            public int compare(Veiculo o1, Veiculo o2) {
//                return -Integer.compare(o1.getAno(), o2.getAno());
//            }
//        });
//
//        return veiculos;
//    }



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

