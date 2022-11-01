public class Lutador extends Personagem{
    private int danoDaArma;

    public Lutador(String nome, int energia, int vida, int danoDaArma) {
        super(nome, energia, vida);
        this.danoDaArma = danoDaArma;
    }

    public void atacar(Personagem alvo){
        ThreadAtacar atacar = new ThreadAtacar(alvo, danoDaArma);
        atacar.start();
    }
}
