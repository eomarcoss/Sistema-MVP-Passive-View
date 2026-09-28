package supermercado.view;

import java.util.List;
import supermercado.model.Categoria;

/** PARTE 1. View passiva: so le/escreve componentes. Nenhuma regra aqui. */
public interface CategoriaView {
    String getNome();
    String getPercentual();
    void setNome(String nome);
    void setPercentual(String percentual);
    void setModo(String texto);                 // "Visualização" | "Inclusão" | "Edição"
    void setCamposEditaveis(boolean editavel);
    void setBotoes(boolean novo, boolean editar, boolean excluir,
                   boolean salvar, boolean cancelar, boolean fechar);
    void setCategorias(List<Categoria> categorias);
    Categoria getCategoriaSelecionada();        // null se nada selecionado
    void selecionar(Categoria categoria);
    void mostrarErro(String mensagem);
    void mostrarInfo(String mensagem);
    boolean confirmar(String pergunta);         // Sim/Nao
    void fechar();
}
