package supermercado.repositorio.memoria;

import java.util.*;
import supermercado.model.Categoria;
import supermercado.repositorio.CategoriaRepository;

public class CategoriaRepositoryMemoria implements CategoriaRepository {
    private final Map<Integer, Categoria> dados = new LinkedHashMap<>();
    private int proximoId = 1;

    @Override public Categoria salvar(Categoria c) {
        if (c.getId() == 0) c.setId(proximoId++);
        dados.put(c.getId(), c);
        return c;
    }
    @Override public void remover(Categoria c) { dados.remove(c.getId()); }
    @Override public Optional<Categoria> buscarPorId(int id) { return Optional.ofNullable(dados.get(id)); }
    @Override public Optional<Categoria> buscarPorNome(String nome) {
        if (nome == null) return Optional.empty();
        return dados.values().stream().filter(c -> c.getNome().equalsIgnoreCase(nome.trim())).findFirst();
    }
    @Override public List<Categoria> listarTodas() { return new ArrayList<>(dados.values()); }
}
