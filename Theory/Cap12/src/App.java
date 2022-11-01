public class App {
    public static void main(String[] args) throws Exception {
        //Extends Thread
        //Implements Runnable
        HelloThread h1 = new HelloThread("Hallo");
        HelloThread h2 = new HelloThread("Hello");
        HelloThread h3 = new HelloThread("Olá");
        HelloThread h4 = new HelloThread("Ciao");

        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
