public class Insta extends RedeSocial{
    public Insta(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Insta");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Insta");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Insta");
    }

    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no Instagram!");
    }
}
