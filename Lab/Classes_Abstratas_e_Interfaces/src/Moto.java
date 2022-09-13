public class Moto extends VeiculoMotorizado implements Manobras{
    private int cilindradas;

    public Moto(int potencia, String cor, int velocidadeAtual, int cilindradas){
        super(potencia, velocidadeAtual, cor);
        this.cilindradas = cilindradas;
    }

    //implementando Interface
    public void empinar(){
        System.out.println("Empinando Moto!");
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
