public abstract class Pizza {
    protected double preco;

    public Pizza(double preco){
        this.preco = preco;
    }

    public abstract void mostraIngredientes();
    public abstract String mostraBrinde();
}
