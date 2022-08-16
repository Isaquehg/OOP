public class Empresa {
    String cnpj;
    String endereco;
    Contato[] contatos = new Contato[10];

    Empresa(String cnpj, String endereco, Contato[] contatos){
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.contatos = contatos;
    }

    void exibirInfo(){
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereco: " + endereco);
        System.out.println("Contatos: ");
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("email: " + contatos[i].email);
                System.out.println("Tel: " + contatos[i].tel);
                System.out.println("Data de Nascimento: " + contatos[i].dataNasc);
            }
        }
    }
}
