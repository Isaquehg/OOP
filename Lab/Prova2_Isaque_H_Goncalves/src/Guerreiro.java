public class Guerreiro extends Personagem implements LutarComArmas{
    private Arma arma;

    public Guerreiro(int vida, int energia, int poder, String nome, Arma arma) {
        super(vida, energia, poder, nome);
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem alvo) {
        int vida_aux = alvo.getVida() - arma.getDano();
        alvo.setVida(vida_aux);
        System.out.println("Vida restante do alvo: " + alvo.getVida());
    }
}
