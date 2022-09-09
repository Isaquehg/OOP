public class Zoologico {
    private String nome;
    private String endereco;
    private Animal[] animais;

    public Zoologico(String nome, String endereco, Animal[] animais) {
        this.nome = nome;
        this.endereco = endereco;
        this.animais = animais;
    }

    public Animal[] getAnimais() {
        return animais;
    }
}
