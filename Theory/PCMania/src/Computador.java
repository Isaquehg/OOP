public class Computador {
    String marca;
    float preco;
    OS sist_op;
    Hardware[] hardware;
    Cliente cliente;

    Computador(int promocao){
        this.hardware = new Hardware[3];

        if(promocao == 1){
            this.marca = "Positivo";
            this.preco = 1300.00f;
            this.sist_op = new OS("Linux Ubuntu", 32);
            hardware[0] = new Hardware("Intel Core i3", 1200);
            hardware[1] = new Hardware("Memória RAM", 4);
            hardware[2] = new Hardware("HD", 0.5f);

        }
        else if(promocao == 2){
            this.marca = "Acer";
            this.preco = 1800.00f;
            this.sist_op = new OS("Windows 8", 64);
            hardware[0] = new Hardware("Intel Core i5", 2260);
            hardware[1] = new Hardware("Memória RAM", 8);
            hardware[2] = new Hardware("HD", 1);
        }
        else if(promocao == 3){
            this.marca = "Vaio";
            this.preco = 2800.00f;
            this.sist_op = new OS("Windows 10", 64);
            hardware[0] = new Hardware("Intel Core i7", 3500);
            hardware[1] = new Hardware("Memória RAM", 16);
            hardware[2] = new Hardware("HD", 2);
        }
    }

    void mostraPCConfigs(){
        System.out.println("------------------------------------");
        System.out.println("INFORMAÇÕES DO PC");
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema Operacional: " + sist_op.nome + " " + sist_op.tipo + " bits");
        System.out.println("Hardware: ");
        for (int i = 0; i < hardware.length; i++) {
            if(hardware[i] != null){
                System.out.println(hardware[i].nome + " " + hardware[i].capacidade);
            }
        }
        System.out.println("------------------------------------");
    }
    void addMemUSB(MemUSB musb1){
        System.out.println("Memoria USB de " + musb1.capacidade + "gb adicionada!");
    }
}
