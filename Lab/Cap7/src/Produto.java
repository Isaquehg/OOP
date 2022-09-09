public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return "Nome: " + nome + "\nPreco: " + preco + "\n";
    }
}
