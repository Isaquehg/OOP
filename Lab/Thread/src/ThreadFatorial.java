public class ThreadFatorial extends Thread{
    double result = 1;
    int num;

    ThreadFatorial(int num){
        this.num = num;
    }

    public void run(){
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + result);
    }
}
