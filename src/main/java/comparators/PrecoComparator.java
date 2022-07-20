package comparators;

import domains.Veiculo;

import java.util.Comparator;

public class PrecoComparator implements Comparator<Veiculo> {

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        if (o1.getPreco() == null) {
            return 1;
        }
        if (o2.getPreco() == null) {
            return -1;
        }
        return o1.getPreco().compareTo(o2.getPreco());
    }
}