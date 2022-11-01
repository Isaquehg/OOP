import java.util.concurrent.TimeUnit;

public class ThreadAtacar extends Thread{
    public void run(){

    }
    public ThreadAtacar(Personagem alvo, int danoDaArma) {
        try{
            TimeUnit.SECONDS.sleep(3);
            int newVida = alvo.getVida() - danoDaArma;
            alvo.setVida(newVida);
            System.out.println(alvo.getNome() + " foi atacado");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
