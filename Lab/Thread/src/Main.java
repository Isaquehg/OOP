public class Main {
    public static void main(String[] args) {
        ThreadCronometro cronometro1 = new ThreadCronometro(8);
        ThreadFatorial fatorial1 = new ThreadFatorial(5);
        ThreadHexagono hexagono1 = new ThreadHexagono(15);

        cronometro1.start();
        fatorial1.start();
        hexagono1.start();
    }
}