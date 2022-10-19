public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("COLLECTIONS");

        Produto prod1 = new Produto("Arroz", 13.8);
        Produto prod2 = new Produto("Iogurte", 4.25);
        Produto prod3 = new Produto("Chocolate", 6.69);

        Carrinho car1 = new Carrinho();

        car1.addProduto(prod1);
        car1.addProduto(prod2);
        car1.addProduto(prod3);

        //Sorting
        car1.sort_Alfabetica();
        car1.sort_Crescente();
    }
}