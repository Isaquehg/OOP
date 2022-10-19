package cadpessoas_model.model;

public class PessoaFisica extends Pessoa{
    String cpf;
    String sexo;
    int idade;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, String sexo) {
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}
