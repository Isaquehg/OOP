public abstract class Personagem {
    private int vida;
    private int energia;
    private int poder;
    private String nome;

    public Personagem(int vida, int energia, int poder, String nome) {
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void usarHabilidade(){
        System.out.println("Usando habilidade");
        energia --;
    }
}
