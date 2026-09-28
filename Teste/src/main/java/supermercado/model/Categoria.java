package supermercado.model;

import java.util.Objects;

public class Categoria {
    private int id;                 // 0 = ainda nao salvo (o repositorio atribui)
    private String nome;
    private double percentualLucro;

    public Categoria(String nome, double percentualLucro) {
        this.nome = nome;
        this.percentualLucro = percentualLucro;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPercentualLucro() { return percentualLucro; }
    public void setPercentualLucro(double percentualLucro) { this.percentualLucro = percentualLucro; }

    @Override public String toString() { return nome; }   // usado pela combo
    @Override public boolean equals(Object o) {
        return o instanceof Categoria c && id != 0 && id == c.id;
    }
    @Override public int hashCode() { return Objects.hash(id); }
}
