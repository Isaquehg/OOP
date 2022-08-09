public class Kart {
    String nome;
    //Agregação
    Piloto pilot;
    //Composição
    Motor motor1;

    Kart(String nome, Piloto piloto1){
        this.nome = nome;
        this.pilot = piloto1;
        this.motor1 = new Motor("150", 250.0f);//composicao
    }

    void pular(){
        System.out.println("Pulando");
    }
    void soltarTurbo(){
        System.out.println("Turbo ativado!");
    }
    void fazerDrift(){
        System.out.println("Fazendo drift");
    }
}
