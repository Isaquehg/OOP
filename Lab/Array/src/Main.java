public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("EXEMPLOS EM AULA: ");
        //criando array
        Conta[] contas = new Conta[3];

        //instanciando objetos da lista
        contas[0] = new Conta("Larry", 15534.03);
        contas[1] = new Conta("Darry", 4444.80);
        contas[2] = new Conta("Merry", 78944.77);

        //iterando
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null) {
                System.out.println("Titular: " + contas[i].nome);
                System.out.println("Saldo: " + contas[i].saldo);
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("EX 1:");

        //criando lista
        Contato[] contatos = new Contato[10];

        //criando objetos
        contatos[0] = new Contato("Larry", "larry@gmail.com", "3599999999", "12/12/1956");
        contatos[1] = new Contato("Darry", "darry@gmail.com", "1100000000", "25/1/2004");
        contatos[2] = new Contato("Merry", "merry@gmail.com", "5155555555", "18/2/1999");

        //instanciando
        Empresa empresa = new Empresa("123456789", "Avenida", contatos);

        //output
        empresa.exibirInfo();

        System.out.println("----------------------------------------------------------");
        System.out.println("EX 2:");

        Produto[] produtos = new Produto[10];

        produtos[0] = new Produto("Arroz", "Alimento", "Pilecco", 21.00);
        produtos[1] = new Produto("Chocolate", "Alimento", "Lacta", 7.50);
        produtos[2] = new Produto("Cloro", "Limpeza", "UAU", 15.00);


        Carrinho carrinho = new Carrinho(produtos);

        //output
        System.out.println("Total do Carrinho: " + carrinho.calculaTotal() + "R$");

        System.out.println("----------------------------------------------------------");
        System.out.println("EX 3:");

        Fornecedor[] fornecedores = new Fornecedor[10];

        fornecedores[0] = new Fornecedor("Alimentos", 12);
        fornecedores[1] = new Fornecedor("Limpeza", 8);
        fornecedores[2] = new Fornecedor("Equipamentos", 2);
        fornecedores[0] = new Fornecedor("Alimentos", 4);

        Restaurante restaurante = new Restaurante("123456789", "Centro", "ABC", fornecedores);

        restaurante.exibirInfo();
    }
}
