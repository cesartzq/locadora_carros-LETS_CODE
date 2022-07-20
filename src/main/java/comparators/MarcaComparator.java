package comparators;

import domains.Veiculo;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Veiculo> {

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
