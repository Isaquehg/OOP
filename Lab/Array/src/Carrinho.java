public class Carrinho {
    double total;
    Produto[] produtos = new Produto[10];

    Carrinho(Produto[] produtos){
        this.produtos = produtos;
    }

    void exibirInfo(){
        System.out.println("");
    }
    double calculaTotal(){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                total += produtos[i].preco;
            }
        }
        return total;
    }
}
