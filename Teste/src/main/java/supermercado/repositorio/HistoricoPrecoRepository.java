package supermercado.repositorio;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import supermercado.model.HistoricoPreco;
import supermercado.model.Produto;

public interface HistoricoPrecoRepository {
    HistoricoPreco salvar(HistoricoPreco registro);
    /** Do mais recente para o mais antigo. */
    List<HistoricoPreco> buscarPorProduto(Produto produto);
    /** Data do calculo global mais recente, se existir. */
    Optional<LocalDate> buscarDataUltimoCalculo();
    List<HistoricoPreco> listarTodos();
}
