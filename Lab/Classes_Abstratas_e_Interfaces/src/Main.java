public class Main {
    public static void main(String[] args) {
        //classes abstratas nao tem objetos de si mesmas, apenas servem de modelo p as classes filhas

        VeiculoMotorizado car1 = new Carro(210, 135, "preto", 4);
        VeiculoMotorizado mot1 = new Moto(320, "Vermelho", 100, 320);
        Bicicleta bike1 = new Bicicleta(12);

        //outputs
        car1.acelerar();
        mot1.acelerar();
        bike1.empinar();
        //casting de classe Mãe p Filha
        ((Moto) mot1).empinar();

        System.out.println("Numero de portas do carro: " + ((Carro) car1).getnPortas());
        System.out.println("Cilindradas moto: " + ((Moto) mot1).getCilindradas());

    }
}
