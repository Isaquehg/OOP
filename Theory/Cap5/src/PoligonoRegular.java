public class PoligonoRegular {
    private int n;//numero de lados
    private double c;//comprimento dos lados
    private double areaPoligono;//area total (P * a) / 2

    public PoligonoRegular(int n, double c) {
        this.n = n;
        this.c = c;
    }

    //Métodos auxiliares, portanto, privados
    private double calculaPerimetro(){
        return c * n;
    }
    private double calculaApotema(){
        return (double) (c / (2 * java.lang.Math.tan(java.lang.Math.toRadians(180 / n))));
    }

    //Calcular área faz parte da interface, portanto, público
    public void calculaArea(){
        areaPoligono = (calculaPerimetro() * calculaApotema()) / 2.0;
    }

    //getter areaPolígono
    public double getAreaPoligono(){
        return areaPoligono;
    }
}
