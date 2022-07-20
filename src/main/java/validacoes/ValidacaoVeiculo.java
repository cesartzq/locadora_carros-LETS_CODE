package validacoes;

import domains.Veiculo;
import exceptions.ValidacaoVeiculoException;

import java.util.Collection;
import java.util.HashSet;

public class ValidacaoVeiculo {

    public static final String MARCA_NAO_ENCONTRADA_MSG = "O Veiculo da marca %s nao foi encontrado";
    public static final String PRECO_INDEFINIDO = "Preco indefinido [%s]";
    private static final String MARCA_NAO_INFORMADA_MSG = "Marca nao informada";

    private final Collection<Validador> validacoes;

    public ValidacaoVeiculo(Collection<Validador> validacoes) {
        this.validacoes = validacoes;
    }

    public void executar(Veiculo veiculo) {
        Collection<ValidacaoType> erros = new HashSet<>();
        for (Validador validador : validacoes) {
            if (!validador.isValido(veiculo)) {
                erros.add(validador.getValidacaoType());
            }
        }

        if (erros.isEmpty()) {
            return;
        }

        StringBuilder builder = new StringBuilder();
        for (ValidacaoType tipo : erros) {
            builder.append(tipo.name()).append(",");
        }

        builder.deleteCharAt(builder.length() - 1);
        String msg = "Foram encontrados os seguintes erros: [%s]";

        throw new ValidacaoVeiculoException(String.format(msg, builder));
    }


}
// SEMPRE SEMPRE SEMPRE SEMPRE constante primeiro que variavel
//    public static void validaPreco(Veiculo veiculo) throws ParametroNaoInformadoException {
//        String msg = format(PRECO_INDEFINIDO, veiculo.getPreco());
//        if (veiculo.getPreco() == null ||  BigDecimal.ZERO.equals(veiculo.getPreco())) {
//            throw new ParametroNaoInformadoException(msg);
//        }
//    }
