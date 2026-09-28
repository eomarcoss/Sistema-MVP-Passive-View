package supermercado.repositorio;

import java.util.List;
import java.util.Optional;
import supermercado.model.Categoria;

public interface CategoriaRepository {
    /** Se id == 0 gera um novo id (inclusao); senao substitui (edicao). */
    Categoria salvar(Categoria categoria);
    void remover(Categoria categoria);
    Optional<Categoria> buscarPorId(int id);
    /** Comparacao exata ignorando maiusculas/minusculas. */
    Optional<Categoria> buscarPorNome(String nome);
    List<Categoria> listarTodas();
}
