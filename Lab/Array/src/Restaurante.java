public class Restaurante {
    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores = new Fornecedor[10];

    Restaurante(String cnpj, String endereco, String nome, Fornecedor[] fornecedores){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        this.fornecedores = fornecedores;
    }

    void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Tipos de fornecedores: ");
        for (int i = 0; i < fornecedores.length; i++) {
            if(fornecedores[i] != null){
                System.out.println(fornecedores[i].tipo);
            }
        }
    }
}
