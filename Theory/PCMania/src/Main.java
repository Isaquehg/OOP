import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int promocao;
        int compras = 0;
        String nome_cliente;
        long cpf_cliente;
        MemUSB usb32;
        MemUSB usb16;
        MemUSB usb1;

        //INPUT
        System.out.println("--------------------------------------------");
        System.out.println("Bem vindo ao PCMania!");

        //nome
        System.out.println("Qual seu nome? ");
        Scanner scanner1 = new Scanner(System.in);
        nome_cliente = scanner1.nextLine();
        //cpf
        System.out.println("Por favor, " + nome_cliente + " insira seu CPF");
        Scanner scanner2 = new Scanner(System.in);
        cpf_cliente = scanner2.nextLong();

        Cliente cliente = new Cliente(nome_cliente, cpf_cliente);

        //opções
        System.out.println("Qual PC você deseja comprar?");
        System.out.println("PROMOÇÃO 1");
        Computador pc1 = new Computador(1);
        pc1.mostraPCConfigs();

        System.out.println("PROMOÇÃO 2");
        Computador pc2 = new Computador(2);
        pc2.mostraPCConfigs();

        System.out.println("PROMOÇÃO 3");
        Computador pc3 = new Computador(3);
        pc3.mostraPCConfigs();

        System.out.println("Para sair, digite 0");

        Scanner scanner3 = new Scanner(System.in);
        promocao = scanner3.nextInt();

        while(promocao != 0 && compras <= 3){
            if(promocao == 1){
                pc1.cliente = cliente;
                cliente.total += pc1.preco;
                System.out.println("PC comprado!");
                System.out.println("Valor gasto atual: " + cliente.calculaTotalCompra());
            }
            else if (promocao == 2) {
                pc2.cliente = cliente;
                cliente.total += pc2.preco;
                System.out.println("PC comprado!");
                System.out.println("Valor gasto atual: " + cliente.calculaTotalCompra());
            }
            else if (promocao == 3) {
                pc3.cliente = cliente;
                cliente.total += pc3.preco;
                System.out.println("PC comprado!");
                System.out.println("Valor gasto atual: " + cliente.calculaTotalCompra());
            }
            else if(promocao != 0){
                System.out.println("Não é uma opção válida.");
            }
            compras ++;

            System.out.println("Escolha outro PC ou saia inserindo 0");
            promocao = scanner3.nextInt();
        }
        System.out.println("--------------------------------------------");
        System.out.println("RESUMO DA COMPRA");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cpf_cliente);
        if (pc1.cliente != null && pc1.cliente.nome == cliente.nome){
            pc1.mostraPCConfigs();
        }
        if (pc2.cliente != null && pc2.cliente.nome == cliente.nome) {
            pc2.mostraPCConfigs();
        }
        if (pc3.cliente != null && pc3.cliente.nome == cliente.nome){
            pc3.mostraPCConfigs();
        }
        System.out.println("TOTAL: " + cliente.calculaTotalCompra() + " R$");
        System.out.println("OBRIGADO POR COMPRAR NA PCMania!!");
    }
}
