import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bruxo extends Personagem {
    private List<Magia> magias = new ArrayList<>();

    public Bruxo(String nome, int energia, int vida) {
        super(nome, energia, vida);
    }


    public void adicionarMagia(Magia magia){
        magias.add(magia);
    }
    public void ordenaMagia(){
        Collections.sort(magias);
    }
    public Magia[] retornaMagias(){
        Magia[] arrayMagia = new Magia[100];
        for (int i = 0; i < magias.size(); i++) {
            if(magias.get(i) != null){
                arrayMagia[i] = magias.get(i);
            }
        }
        return arrayMagia;
    }
    public void deletarMagia(int index){
        magias.remove(index);
    }
    public void soltarMagia(int index){
        ThreadSoltarMagia soltarMagia = new ThreadSoltarMagia(magias.get(index));
        soltarMagia.start();
    }
    public int retornaIndexMagia(Magia magia){
        return magias.indexOf(magia);
    }


}
