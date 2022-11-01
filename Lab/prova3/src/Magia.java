public class Magia implements Comparable <Magia>{
    private int nivel;
    private String nome;

    public Magia(int nivel, String nome) {
        this.nivel = nivel;
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Magia o) {
        if(nivel < o.getNivel()){
            return -1;
        }
        else if(nivel > o.getNivel()){
            return 1;
        }
        return 0;
    }
}
