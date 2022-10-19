public class Main {
    public static void main(String[] args) {
        //Criando instâncias
        Arma arma1 = new Arma("Espada", 38);
        Arma arma2 = new Arma("Laminas", 42);

        Assassino assassino1 = new Assassino(120, 40, 35, "Garry", arma2);
        Guerreiro guerreiro1 = new Guerreiro(220, 46, 45, "Larry", arma1);
        Mago mago1 = new Mago(84, 85, 56, "Harry");

        //Métodos
        System.out.println("-----------------------------------");
        System.out.println("Métodos do Assassino");
        assassino1.atacar(guerreiro1);
        assassino1.usarHabilidade();

        System.out.println("-----------------------------------");
        System.out.println("Métodos do Guerreiro");
        guerreiro1.atacar(mago1);
        guerreiro1.usarHabilidade();

        System.out.println("-----------------------------------");
        System.out.println("Métodos do Mago");
        mago1.usarHabilidade();
    }
}