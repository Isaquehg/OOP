import java.util.Date;

public class Robo {
    private static long serialNumberGenerator = 0;
    private long serialNumber;
    private Date dataCriacao;
    Processador processador;
    Corpo corpo;

    public Robo(String marca_proc, float freq_proc, String tipo, String cor) {
        this.serialNumber = serialNumberGenerator ++;
        this.dataCriacao = new Date();
        this.processador = new Processador(marca_proc, freq_proc);
        this.corpo = new Corpo(tipo, cor);
    }
    public Robo(String tipo, String cor) {
        this.serialNumber = serialNumberGenerator ++;
        this.dataCriacao = new Date();
        this.corpo = new Corpo(tipo, cor);
    }

    public void mostraConfig(){
        System.out.println("---------------------------------");
        System.out.println("INFORMAÇÕES DO ROBÔ");
        System.out.println("Número Serial: " + serialNumber);
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Corpo tipo " + corpo.getTipo() + ", cor " + corpo.getCor());
        if(processador != null){
            System.out.println("Processador: " + processador.getMarca() + " " + processador.getFreq_Processamento() + "MHz");
        }
        else{
            System.out.println("Não possui processador");
        }
        System.out.println("---------------------------------");
    }
}
