package supermercado.excecao;

/** Dado de entrada invalido (campo vazio, valor negativo, duplicado...). */
public class ValidacaoException extends Exception {
    public ValidacaoException(String mensagem) { super(mensagem); }
}
