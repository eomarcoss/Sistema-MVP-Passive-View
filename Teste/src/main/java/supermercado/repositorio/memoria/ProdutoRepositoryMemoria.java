package supermercado.repositorio.memoria;

import java.util.*;
import supermercado.model.Categoria;
import supermercado.model.Produto;
import supermercado.repositorio.ProdutoRepository;

public class ProdutoRepositoryMemoria implements ProdutoRepository {
    private final Map<Integer, Produto> dados = new LinkedHashMap<>();
    private int proximoId = 1;

    @Override public Produto salvar(Produto p) {
        if (p.getId() == 0) p.setId(proximoId++);
        dados.put(p.getId(), p);
        return p;
    }
    @Override public Optional<Produto> buscarPorId(int id) { return Optional.ofNullable(dados.get(id)); }
    @Override public List<Produto> listarTodos() { return new ArrayList<>(dados.values()); }
    @Override public List<Produto> buscarPorNome(String trecho) {
        String t = trecho == null ? "" : trecho.trim().toLowerCase();
        return dados.values().stream().filter(p -> p.getNome().toLowerCase().contains(t)).toList();
    }
    @Override public List<Produto> buscarPorNomeCategoria(String trecho) {
        String t = trecho == null ? "" : trecho.trim().toLowerCase();
        return dados.values().stream()
                .filter(p -> p.getCategoria().getNome().toLowerCase().contains(t)).toList();
    }
    @Override public boolean existePorCategoria(Categoria c) {
        return dados.values().stream().anyMatch(p -> p.getCategoria().equals(c));
    }
}
