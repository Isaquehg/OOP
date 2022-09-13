public abstract class Unidade {
    protected String endereco;
    protected String nomeResponsavel;
    public Pizza[] pizzas;

    Unidade(String endereco, String nomeResponsavel, Pizza[] pizzas){
        this.endereco = endereco;
        this.nomeResponsavel = nomeResponsavel;
        this.pizzas = pizzas;
    }

    public void mostraPizza(){
        System.out.println("Informações da Pizza: ");
        for (int i = 0; i < pizzas.length; i++) {
            if(pizzas[i] != null){
                if(pizzas[i] instanceof Brasileira){
                    System.out.println("Brasileira");
                    pizzas[i].mostraIngredientes();
                    System.out.print("Brinde: ");
                    System.out.println(pizzas[i].mostraBrinde());
                }
                else if(pizzas[i] instanceof Pepperoni){
                    System.out.println("Pepperoni");
                    pizzas[i].mostraIngredientes();
                    System.out.print("Brinde: ");
                    System.out.println(pizzas[i].mostraBrinde());
                }
                else if(pizzas[i] instanceof Supreme){
                    System.out.println("Supreme");
                    pizzas[i].mostraIngredientes();
                    System.out.print("Brinde: ");
                    System.out.println(pizzas[i].mostraBrinde());
                }
            }
        }
    }
}
