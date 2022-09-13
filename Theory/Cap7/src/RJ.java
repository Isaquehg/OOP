public class RJ extends Unidade{
    RJ(String endereco, String nomeResponsavel, Pizza[] pizzas) {
        super(endereco, nomeResponsavel, pizzas);
    }

    @Override
    public void mostraPizza() {
        System.out.println("------------------------------------");
        System.out.println("Pizzas Unidade RJ");
        super.mostraPizza();
        System.out.println("------------------------------------");
    }
}
