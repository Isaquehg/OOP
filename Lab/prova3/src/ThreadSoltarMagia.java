import java.util.concurrent.TimeUnit;

public class ThreadSoltarMagia extends Thread{
    public void run(){

    }
    public ThreadSoltarMagia(Magia magia) {
        try{
            TimeUnit.SECONDS.sleep(3);
            System.out.println(magia.getNome() + " foi conjurada");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
