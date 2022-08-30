public class Conta {
    private static int qntClientes = 0;
    private double saldo;
    Cliente cliente;

    Conta(Cliente cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
        qntClientes ++;
    }

    //setters p saldo
    public void deposita(double valor){
        saldo += valor;
        System.out.println(valor + " depositado com sucesso");
        System.out.println("Saldo atual: " + saldo);
    }
    public void saca(double valor){
        saldo -= valor;
        System.out.println(valor + " removido da conta");
        System.out.println("Saldo atual: " + saldo);
    }

    //getter p saldo
    public void extrato(){
        System.out.println("Extrato");
        System.out.println("Saldo atual: " + saldo);
    }

    //getter p qntCliente
    public static int getQntCliente(){
        return qntClientes;
    }
}
