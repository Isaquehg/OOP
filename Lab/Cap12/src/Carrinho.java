import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public Carrinho() {
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public void sort_Crescente(){
        Produto.tipo = true;
        Collections.sort(produtos);
    }
    public void sort_Alfabetica(){
        Produto.tipo = false;
        Collections.sort(produtos);
    }
}
