package dao;

import java.util.List;

public interface BaseDao<E extends Salvavel, ID> {
    void salvar(E entidade);
    List<E> buscarTodos();
    void remover(E entidade);

    E buscaPorId(ID id);

    <SEC> void print(List<SEC> id);
}
