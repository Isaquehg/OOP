public class Pepperoni extends Pizza{

    public Pepperoni() {
        super(15.0);
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Queijo + Pepperoni + tomate + orégano");
    }

    @Override
    public String mostraBrinde() {
        return "Caneta";
    }
}
