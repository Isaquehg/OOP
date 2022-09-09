public class Conta {
    //ENCAPSULAMENTO DE DADOS(private)
    private int numero;
    private float saldo;
    private String proprietario;
    public static int total_contas = 0;

    public Conta(int numero, float saldo, String proprietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.proprietario = proprietario;
        total_contas ++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado");
            System.out.println("Novo saldo: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
}