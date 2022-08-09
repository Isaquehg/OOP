public class Carro {
    String cor;
    String marca;
    String modelo;
    float vel_max;
    float vel_atual;
    Motor motor;

    Carro(String cor, String marca, String modelo, float vel_max, float vel_atual, Motor motor){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.vel_max = vel_max;
        this.vel_atual = vel_atual;
        this.motor = motor;
    }

    void ligado(){
        System.out.println("O carro está ligado");
    }
    void acelerar(){
        System.out.println("Acelerando...");
    }

    void mostraInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Máxima: " + vel_max + " km/h");
        System.out.println("Velocidade Atual: " + vel_atual + " km/h");
        System.out.println("Potência: " + motor.potencia + "cv");
        System.out.println("Tipo do motor: " + motor.tipo);
    }
}
