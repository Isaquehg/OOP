public class Produto implements Comparable{
    private String nome;
    private double preco;
    public static boolean tipo;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Object o) {
        if(tipo){
            return Double.compare(this.preco, ((Produto) o).preco);
        }
        else{
            return CharSequence.compare(this.nome, ((Produto) o).nome);
        }
    }

    @Override
    public String toString(){
        return nome;
    }
}
