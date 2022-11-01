public abstract class Personagem {
    private String nome;
    private int energia;
    private int vida;

    public Personagem(String nome, int energia, int vida) {
        this.nome = nome;
        this.energia = energia;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome(){
        return nome;
    }
}
