public class Main {
    public static void main(String[] args) {
        //Isaque Hollanda Gonçalves
        //GES - 166 - 4ºP

        //criando armas
        Arma arma1 = new Arma(25, "Rifle");
        Arma arma2 = new Arma(42, "Machado");

        //criando coleção de itens
        Item[] itens = new Item[3];
        itens[0] = new Item("Poção", 2);
        itens[1] = new Item("Cajado", 1);

        //instanciando personagens
        Personagem personagem1 = new Personagem(150, "Larry", arma1, itens);
        Personagem personagem2 = new Personagem(210, "Merry", arma2);

        //output
        personagem1.mostraInfo();
        personagem1.atacar();
        System.out.println("-----------------------------");
        personagem2.mostraInfo();
        personagem2.atacar();
    }
}
