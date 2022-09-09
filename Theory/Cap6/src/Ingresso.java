import java.util.Date;

public class Ingresso {
    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao = 15.0f;
    protected Date date;

    public Ingresso(float valorIngresso) {
        numberGenerator ++;
        numero = numberGenerator;
        date = new Date();
        this.valorIngresso = valorIngresso;
    }

    public float calculaTotalIngresso(){
        return valorIngresso + taxaCartao;
    }
    public void mostraInfo(){
        System.out.println("Numero do ingresso: " + numero);
        System.out.println("Data da compra: " + date);
        System.out.println("Total do ingresso: " + calculaTotalIngresso());
    }
}
