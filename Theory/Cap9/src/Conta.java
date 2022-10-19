public class Conta implements Comparable <Conta>{
    String dono;
    int num;
    double saldo;

    public Conta(String dono, int num, double saldo) {
        this.dono = dono;
        this.num = num;
        this.saldo = saldo;
    }

    //ordenar por maior
    @Override
    public int compareTo(Conta o) {
        if(num < o.num){
            return -1;
        }
        else if(num > o.num){
            return 1;
        }
        else{
            return 0;
        }
    }
}
