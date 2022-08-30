public class Conta {
    private int numero;

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

    private float saldo;//ENCAPSULAMENTO DE DADOS
    private String proprietario;

    Conta(int numero, float saldo, String proprietario){
        this.numero = numero;
        this.saldo = saldo;
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