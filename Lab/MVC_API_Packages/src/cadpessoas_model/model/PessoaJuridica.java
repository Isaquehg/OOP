package cadpessoas_model.model;

public class PessoaJuridica extends Pessoa{
    String cnpj;
    String ramo;

    public PessoaJuridica(String nome, String endereco, String ramo, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.ramo = ramo;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getRamo() {
        return ramo;
    }
}
