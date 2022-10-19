public class Facebook extends RedeSocial implements VideoConf, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no Facebook");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no Facebook!");
    }
}
