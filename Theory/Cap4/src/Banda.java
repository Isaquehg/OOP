public class Banda {
    public String nome;
    public String genero;

    //Atributos implícitos
    public Musico[] musicos;
    public Empresario empresario;
    public Musica[] musicas;

    Banda(String nome, String genero, Musico[] musicos, Musica[] musicas, Empresario empresario){
        this.nome = nome;
        this.genero = genero;
        this.musicos = musicos;
        this.musicas = musicas;
        this.empresario = empresario;
    }
    //OVERLOAD caso não tenha empresario!
    Banda(String nome, String genero, Musico[] musicos, Musica[] musicas){
        this.nome = nome;
        this.genero = genero;
        this.musicos = musicos;
        this.musicas = musicas;
    }

    void mostraInfo(){
        System.out.println("Nome da Banda: " + this.nome);
        if(this.empresario != null){
            System.out.println("Empresario: " + this.empresario.nome);
        }
        else{
            System.out.println("Não possui empresário");
        }
        System.out.println("");
        System.out.println("Músicas:");
        for (int i = 0; i < this.musicas.length; i++) {
            if(this.musicas[i] != null){
                System.out.println(this.musicas[i].nome);
            }
        }
        System.out.println("");
        System.out.println("Músicos:");
        for (int i = 0; i < this.musicos.length; i++) {
            if(this.musicos[i] != null){
                System.out.println(this.musicos[i].nome);
            }
        }
    }
}