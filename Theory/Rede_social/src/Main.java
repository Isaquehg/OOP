public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("REDE SOCIAL");

        //Contas de cada usuário
        RedeSocial[] redesociais1 = new RedeSocial[10];
        RedeSocial[] redesociais2 = new RedeSocial[10];
        RedeSocial[] redesociais3 = new RedeSocial[10];

        Facebook facebook1 = new Facebook("123456789", 52);
        Facebook facebook2 = new Facebook("101010101", 478);
        Facebook facebook3 = new Facebook("987654321", 13);

        Insta insta1 = new Insta("123456789", 321);
        Insta insta2 = new Insta("987654321", 27);
        Insta insta3 = new Insta("797979797", 1504);

        Twitter twitter1 = new Twitter("456789123", 84);
        Twitter twitter2 = new Twitter("789456123", 654);
        Twitter twitter3 = new Twitter("313245187", 888);

        GooglePlus googlePlus1 = new GooglePlus("789123456", 58);
        GooglePlus googlePlus2 = new GooglePlus("321654987", 578);
        GooglePlus googlePlus3 = new GooglePlus("123456789", 5898);

        //Atribuições para cada usuário
        /*
        Obs.:
        redesociais1 -> user1
        redesociais2 -> user2
        redesociais3 -> user3
        */
        redesociais1[0] = facebook1;
        redesociais1[1] = facebook2;
        redesociais1[2] = googlePlus1;
        redesociais1[3] = insta1;

        redesociais2[0] = facebook3;
        redesociais2[1] = insta2;
        redesociais2[2] = twitter1;
        redesociais2[3] = googlePlus2;

        redesociais3[0] = insta3;
        redesociais3[1] = twitter2;
        redesociais3[2] = twitter3;
        redesociais3[3] = googlePlus3;

        //Usuários
        Usuario user1 = new Usuario("Larry", "larry@gmail.com", redesociais1);
        Usuario user2 = new Usuario("Darry", "darry@hotmail.com", redesociais2);
        Usuario user3 = new Usuario("Merry", "merry@outlook.com", redesociais3);

        //OUTPUT MÉTODOS
        //Facebook
        user1.redesociais[0].curtirPublicacao();
        ((Facebook) user1.redesociais[1]).compartilhar();
        user1.redesociais[0].postarFoto();

        //Insta
        user2.redesociais[1].postarVideo();
        user2.redesociais[1].postarComentario();
        user2.redesociais[1].postarFoto();

        //Twitter
        user3.redesociais[1].postarFoto();
        user3.redesociais[1].postarComentario();
        user3.redesociais[2].postarVideo();

        //Google+
        user1.redesociais[2].postarComentario();
        user1.redesociais[2].postarVideo();
        ((GooglePlus) user1.redesociais[2]).fazStreaming();
    }
}