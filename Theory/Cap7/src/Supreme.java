public class Supreme extends Pizza{


    public Supreme() {
        super(25.0);
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes:");
        System.out.println("Queijo + cebola + pimentao + azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Caneca";
    }
}
