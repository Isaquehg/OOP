public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(123456, 1500000.0f, "Newton");

        c1.sacar(2000000.0f);
        c1.sacar(40000.0f);

        System.out.println("---------------------------------");
        System.out.println("EX1 - POLÍGONOS");

        PoligonoRegular poligono1 = new PoligonoRegular(4, 3);
        poligono1.calculaArea();
        System.out.println("Área do Polígono: " + poligono1.getAreaPoligono());

    }
}