package dao;

import domains.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDao implements BaseDao<Veiculo, String> {

    private static List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void salvar(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("veiculo salvo" + veiculo);
    }

    @Override
    public List<Veiculo> buscarTodos() {
        return veiculos;
    }

    @Override
    public void remover(Veiculo veiculo) {
        veiculos.remove(veiculo);
        System.out.println("veiculo removido" + veiculo);
    }

    @Override
    public Veiculo buscaPorId(String o) {
        return null;
    }

    @Override
    public <SEC> void print(List<SEC> id) {
        System.out.println(id);
    }
}
