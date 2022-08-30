public class Calculadora {
    private static double PI = 3.14;

    //getter & setter
    double getPI(){
        return PI;
    }
    void setPI(double newValue){
        PI = newValue;
    }

    //metodos da propria classe(static)
    static double circunferencia(double raio){
        return 2 * PI * raio;
    }
    static double volume(double raio){
        return (4 / 3.0) * PI * java.lang.Math.pow(raio, 3);
    }
}
