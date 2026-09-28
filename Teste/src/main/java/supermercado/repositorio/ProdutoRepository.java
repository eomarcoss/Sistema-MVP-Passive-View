package supermercado.repositorio;

import java.util.List;
import java.util.Optional;
import supermercado.model.Categoria;
import supermercado.model.Produto;

public interface ProdutoRepository {
    Produto salvar(Produto produto);          // id == 0 -> inclusao
    Optional<Produto> buscarPorId(int id);
    List<Produto> listarTodos();
    /** Nome contem o texto, ignorando maiusculas/minusculas. Texto vazio = todos. */
    List<Produto> buscarPorNome(String trecho);
    /** Nome da categoria contem o texto, ignorando maiusculas/minusculas. Vazio = todos. */
    List<Produto> buscarPorNomeCategoria(String trecho);
    /** Usado pela Parte 1 para bloquear exclusao de categoria. */
    boolean existePorCategoria(Categoria categoria);
}
