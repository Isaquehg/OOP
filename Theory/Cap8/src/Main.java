import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //todos metodos da interface são public abstract por padrao

        //PACMAN
        System.out.println("--------------------------------------");
        System.out.println("BEM VINDO AO PACMAN!");
        //Preparação do cenário
        Random rand_num = new Random();

        int rand_x = rand_num.nextInt(100);
        int rand_y = rand_num.nextInt(100);

        int[][] matriz = new int[100][100];

        Personagem pacman1 = new PacMan("Amarelo", 0, 0, 3);
        Personagem inimigo1 = new Inimigo("Preto", )
    }
}