public class SP extends Unidade{

    SP(String endereco, String nomeResponsavel, Pizza[] pizzas) {
        super(endereco, nomeResponsavel, pizzas);
    }

    @Override
    public void mostraPizza() {
        System.out.println("------------------------------------");
        System.out.println("Pizzas Unidade SP");
        super.mostraPizza();
        System.out.println("------------------------------------");
    }
}
