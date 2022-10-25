import java.util.concurrent.TimeUnit;

public class ThreadCronometro extends Thread{
    int tempo;

    ThreadCronometro(int tempo){
        this.tempo = tempo;
    }

    public void run(){
        for (int i = 0; i < tempo; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}
