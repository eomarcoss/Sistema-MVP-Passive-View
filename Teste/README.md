# Sistema de Supermercado (Java 21 / Maven / Swing / MVP Passive View)

## Executar
    mvn compile exec:java

## Divisão
- Parte 1: Categorias + Tela principal + Main (CategoriaService, CategoriaPresenter, CategoriaView, CategoriaFrame, MainFrame)
- Parte 2: Produtos (ProdutoService, Busca/Form/Visualizacao: Presenter + View + Frame)
- Parte 3: Cálculo, Histórico e Seeder (PrecoService, Seeder, CalculoMargem/HistoricoPreco: Presenter + View + Frame)

## Regras do grupo
- Cada um edita só os próprios arquivos (principalmente os `.form`).
- Views passivas: sem validação/cálculo. Presenter converte texto -> número; Service valida.
- Arredondar sempre com `Arredondamento.duasCasas` / `PrecoService.calcularPrecoVenda`.
- Navegação entre telas: métodos estáticos `abrir...` das Frames (contrato já definido).
