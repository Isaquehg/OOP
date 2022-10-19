import java.util.Collection;

public class Moeda implements Comparable<Moeda>{
    private double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Moeda o) {
        if(valor < o.getValor()){
            return -1;
        }
        else if(valor > o.getValor()){
            return 1;
        }
        return 0;
    }
}
