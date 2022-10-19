public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConf{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no G+");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no G+");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no G+");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no G+");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no G+");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no G+");
    }
}
