public class Usuario {
    private String nome;
    private String email;
    public RedeSocial[] redesociais;

    public Usuario(String nome, String email, RedeSocial[] redesociais) {
        this.nome = nome;
        this.email = email;
        this.redesociais = redesociais;
    }

}
