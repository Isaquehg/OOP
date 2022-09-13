public class Bicicleta implements Manobras{
    private int nMarchas;

    Bicicleta(int nMarchas){
        this.nMarchas = nMarchas;
    }

    //implementando Interface
    public void empinar(){
        System.out.println("Empinando Bicicleta!");
    }
}
