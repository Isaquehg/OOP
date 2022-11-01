public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Prova 3");

        //Instancia Magias
        Magia magia1 = new Magia(300, "Fogo");
        Magia magia2 = new Magia(540, "Gelo");
        Magia magia3 = new Magia(55, "Água");
        Magia magia4 = new Magia(150, "Energia");

        //Instancia Bruxo e Adição Magias
        Bruxo bruxo1 = new Bruxo("Larry", 250, 512);
        bruxo1.adicionarMagia(magia1);
        bruxo1.adicionarMagia(magia2);
        bruxo1.adicionarMagia(magia3);
        bruxo1.adicionarMagia(magia4);

        //Teste Métodos
        bruxo1.deletarMagia(2);
        bruxo1.ordenaMagia();
        System.out.println("Index Magia 1: " + bruxo1.retornaIndexMagia(magia1));
        System.out.println("Magias adicionadas: ");
        for (int i = 0; i < bruxo1.retornaMagias().length; i++) {
            if(bruxo1.retornaMagias()[i] != null){
                System.out.println(bruxo1.retornaMagias()[i].getNome() + ": " + bruxo1.retornaMagias()[i].getNivel());
            }
        }
        System.out.println();

        //Teste Threads
        bruxo1.soltarMagia(0);
        Lutador lutador1 = new Lutador("Darry", 120, 1028, 225);
        lutador1.atacar(bruxo1);
    }
}