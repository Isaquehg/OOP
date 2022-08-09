public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        System.out.println("Produto criado com sucesso.");
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    void mostraInfo(){
        System.out.println("Código de série: " + codigoSerie);
        System.out.println("Código do material: " + codigoProduto);
        System.out.println("Nome do material: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
}
