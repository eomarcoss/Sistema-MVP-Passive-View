package supermercado.model;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private double precoCusto;
    private Categoria categoria;
    // Dados calculados: nulos ate o primeiro calculo. Nunca editados pelo usuario.
    private Double margemAtual;
    private Double precoVendaAtual;

    public Produto(String nome, double precoCusto, Categoria categoria) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPrecoCusto() { return precoCusto; }
    public void setPrecoCusto(double precoCusto) { this.precoCusto = precoCusto; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Double getMargemAtual() { return margemAtual; }
    public void setMargemAtual(Double margemAtual) { this.margemAtual = margemAtual; }
    public Double getPrecoVendaAtual() { return precoVendaAtual; }
    public void setPrecoVendaAtual(Double precoVendaAtual) { this.precoVendaAtual = precoVendaAtual; }

    @Override public String toString() { return nome; }
    @Override public boolean equals(Object o) {
        return o instanceof Produto p && id != 0 && id == p.id;
    }
    @Override public int hashCode() { return Objects.hash(id); }
}
