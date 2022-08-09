public class Principal {
    public static void main(String[] args) {
        //EXERCÍCIO 1
        Produto produto1 = new Produto(135473, "fadfvrag", "café",
                "alimento", 1550);
        Produto produto2 = new Produto(457333, "hkjkljlçlkjil", "desinfetante",
                "limpeza", 550);

        produto1.mostraInfo();
        produto2.mostraInfo();

        //EXERCÍCIO 2
        Motor motor1 = new Motor(340, "Em linha");
        Motor motor2 = new Motor(210, "Em linha");

        Carro carro1 = new Carro("Preto", "Volvo", "AC40", 265.0f, 120.0f, motor1);
        carro1.mostraInfo();

        System.out.println("------------------------------------------------");

        Carro carro2 = new Carro("Branco", "Honda", "Civic", 235.0f, 82.0f, motor2);
        carro2.mostraInfo();
    }
}
