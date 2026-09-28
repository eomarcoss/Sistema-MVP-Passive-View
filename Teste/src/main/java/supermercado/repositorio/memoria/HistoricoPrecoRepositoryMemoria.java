package supermercado.repositorio.memoria;

import java.time.LocalDate;
import java.util.*;
import supermercado.model.HistoricoPreco;
import supermercado.model.Produto;
import supermercado.repositorio.HistoricoPrecoRepository;

public class HistoricoPrecoRepositoryMemoria implements HistoricoPrecoRepository {
    private final List<HistoricoPreco> dados = new ArrayList<>();
    private int proximoId = 1;

    @Override public HistoricoPreco salvar(HistoricoPreco r) {
        r.setId(proximoId++);
        dados.add(r);
        return r;
    }
    @Override public List<HistoricoPreco> buscarPorProduto(Produto p) {
        return dados.stream()
                .filter(h -> h.getProduto().equals(p))
                .sorted(Comparator.comparing(HistoricoPreco::getData).reversed()
                        .thenComparing(Comparator.comparingInt(HistoricoPreco::getId).reversed()))
                .toList();
    }
    @Override public Optional<LocalDate> buscarDataUltimoCalculo() {
        return dados.stream().map(HistoricoPreco::getData).max(Comparator.naturalOrder());
    }
    @Override public List<HistoricoPreco> listarTodos() { return new ArrayList<>(dados); }
}
