public class Carro extends VeiculoMotorizado{
    private int nPortas;

    public Carro(int potencia, int velocidadeAtual, String cor, int nPortas) {
        super(potencia, velocidadeAtual, cor);
        this.nPortas = nPortas;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
}
