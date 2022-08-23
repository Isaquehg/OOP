public class Personagem {
    int vida;
    String nome;
    Arma arma;
    Item[] itens;

    Personagem(int vida, String nome, Arma arma, Item[] itens){
        this.vida = vida;
        this.arma = arma;
        this.nome = nome;
        this.itens = itens;
    }
    Personagem(int vida, String nome, Arma arma){
        this.vida = vida;
        this.arma = arma;
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Nome da arma: " + arma.nome);
        System.out.println("Dano da arma: " + arma.dano);
        System.out.print("Itens: ");
        boolean tem_itens = false;
        if(itens != null) {
            for (int i = 0; i < itens.length; i++) {
                if (itens[i] != null) {
                    tem_itens = true;
                    System.out.print(itens[i].nome + ", ");
                }
            }
            System.out.println(" ");
        }
        else{
            System.out.println("Não possui.");
        }

    }
    void atacar(){
        System.out.println("Dano da arma: " + arma.dano);
    }

}
