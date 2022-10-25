import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ThreadHexagono extends Thread{
    double area;
    double s;

    ThreadHexagono(double s){
        this.s = s;
    }

    public void run(){
        area = (3 * sqrt(3) * pow(s, 2));
        System.out.println("Area do Hexágono: " + area);
    }
}
