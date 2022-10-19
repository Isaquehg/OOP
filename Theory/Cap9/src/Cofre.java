import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofre{
    private double valor_Moeda;
    private List<Moeda> moedas = new ArrayList<>();
    private double valorTotal = 0;
    private int quantMoedas = 0;

    public Cofre() {
    }

    public void addMoeda(Moeda m){
        moedas.add(m);
        quantMoedas ++;
        valorTotal += m.getValor();
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public int getQuantMoedas(){
        return quantMoedas;
    }
    public Moeda getMoedaMaiorValor(){
        return (Moeda) Collections.max((ArrayList) moedas);
    }
    public void ordenaMoedas(){
        Collections.sort((ArrayList) moedas);
    }
}
