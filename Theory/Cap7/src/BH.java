public class BH extends Unidade{
    BH(String endereco, String nomeResponsavel, Pizza[] pizzas) {
        super(endereco, nomeResponsavel, pizzas);
    }

    @Override
    public void mostraPizza() {
        System.out.println("------------------------------------");
        System.out.println("Pizzas Unidade BH");
        super.mostraPizza();
        System.out.println("------------------------------------");
    }
}
