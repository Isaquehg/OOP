public class VeiculoMotorizado {
    private int potencia;
    private int velocidadeAtual;
    private String cor;

    VeiculoMotorizado(int potencia, int velocidadeAtual, String cor){
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
        this.potencia = potencia;
    }

    public void acelerar(){
        this.velocidadeAtual += 15;
        System.out.println("Nova velocidade atual: " + this.velocidadeAtual);
    }
}
