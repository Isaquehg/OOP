public class Brasileira extends Pizza{

    public Brasileira() {
        super(20.0);
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Mussarela + Requeijo + Presunto + Azeitona");
    }

    @Override
    public String mostraBrinde() {
        return "Chaveiro";
    }
}
