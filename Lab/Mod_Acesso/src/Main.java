public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("EX1");

        //Com o método static, podemos usar metodos e atributos sem precisar criar um objeto. Ele pertencerá à própria classe
        Calculadora.volume(3.5);
        Calculadora.circunferencia(5.0);

        System.out.println("----------------------------------------");
        System.out.println("EX2");

        //instanciando
        Cliente cliente1 = new Cliente("Larry", 123456789);
        Conta conta1 = new Conta(cliente1, 15000.00);

        //output
        conta1.deposita(400.0);
        conta1.saca(520.0);
        conta1.extrato();

        //obtendo quantos objetos foram criados com getter da própria classe
        System.out.println("Número de contas criadas: " + Conta.getQntCliente());
    }
}
