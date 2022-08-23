public class Cliente {
    String nome;
    long cpf;
    float total = 0;

    Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    float calculaTotalCompra(){
        return total;
    }
}
