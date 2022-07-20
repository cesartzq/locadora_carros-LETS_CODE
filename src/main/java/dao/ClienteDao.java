package dao;

import domains.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements BaseDao<Cliente, String> {
    private static List<Cliente> clientes = new ArrayList<>();

    @Override
    public void salvar(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente salvo" + cliente);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public void remover(Cliente cliente) {
        clientes.remove(cliente);
        System.out.println("Cliente removido" + cliente);
    }

    @Override
    public Cliente buscaPorId(String email) {
        return null;
    }

    @Override
    public <SEC> void print(List<SEC> id) {
        System.out.println(id);
    }

}
