package supermercado.excecao;

/** Violacao de regra de negocio (ex.: intervalo de 10 dias, categoria com produtos). */
public class RegraNegocioException extends Exception {
    public RegraNegocioException(String mensagem) { super(mensagem); }
}
