public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("LOJA");

        //Products list
        Produto[] produtos = new Produto[50];
        
        Notebook notebook1 = new Notebook("Macbook", 8995.00, 256.0, "Apple M1", "Integrated GPU");
        Camiseta camiseta1 = new Camiseta("Camiseta Levi's", 115.0, "Blue", "P");
        //another way to create child classes instances
        Produto camiseta2 = new Camiseta("CK", 120.0, "Yellow", "G");

        //filling products
        produtos[0] = notebook1;
        produtos[1] = camiseta1;
        produtos[2] = camiseta2;

        //outputs
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                if(produtos[i] instanceof Notebook notebook_aux){
                    System.out.println("É um notebook");
                    //System.out.println(produtos[i].etiquetaPreco());
                    System.out.println(notebook_aux.etiquetaPreco());
                    System.out.println("-----------------------------");
                }
                else if(produtos[i] instanceof Camiseta camiseta_aux){
                    System.out.println(camiseta_aux.etiquetaPreco());
                    //System.out.println(produtos[i].etiquetaPreco());
                    System.out.println("-----------------------------");
                }
            }
        }
        
        System.out.println(notebook1.etiquetaPreco());
    }
}
