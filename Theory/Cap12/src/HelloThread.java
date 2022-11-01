public class HelloThread extends Thread{
    String word;
    public HelloThread(String word){
        this.word = word;
    }
    public void run(){
        while(true){
            System.out.println(word);
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
