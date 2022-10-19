package cadpessoas_model.model;

public abstract class Pessoa {
    String nome;
    String endereco;

    Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
