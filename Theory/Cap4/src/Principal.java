public class Principal {
    public static void main(String[] args) {
        /*
        CARACTERÍSTICAS DE ARRAY
        1. Tamanho pré-definido
        2. Guarda elementos homogêneos
        3. Declarado como objeto
        */

        // Declarar Array de primitivos como objeto
        int[] array1 = new int[10];

        // Inserindo elementos
        //Obs.: Caso nãp tenha elementos inseridos, será preenchido por 0s as posições vazias
        array1[0] = 25;
        for (int i = 0; i < array1.length; i ++){
            array1[i] = i + 250;
            System.out.println(array1[i]);
        }
        //Enhanced for tem melhor desempenho
        /*
        for (int j : array1) {
            System.out.println("Enhanced FOR uses 1 to 1 steps: " + j);
        }
        */

        System.out.println("-------------------------------------------------------");
        System.out.println("ARRAY DE REFERÊNCIAS(objetos)");
        //Array de Referências
        Conta[] contas = new Conta[10];

        //Objetos a inserir no array
        Conta conta1 = new Conta("Larry", 123456789, 15000.00f);
        Conta conta2 = new Conta("Darry", 123456789, 30000.00f);

        //Inserindo elementos
        //Cada posição do array irá apontar para o mesmo local que conta1, conta2, conta... aponta

        contas[0] = conta1;
        contas[1] = conta2;
        contas[2] = new Conta("Merry", 123456789, 10000.00f);

        for (int i = 0; i < contas.length; i++) {
            if(contas[i]!= null) {
                System.out.println(contas[i].dono);
            }
        }

        for (Conta aux : contas) {
            if(aux != null){     //Mostrar posições preenchidas
                System.out.println("Dono: " + aux.dono);
                System.out.println("Saldo: " + aux.saldo);
            }
        }


        System.out.println("----------------------------------------------");
        System.out.println("MULTIPLICIDADE");

        Musico[] musicos = new Musico[100];
        musicos[0] = new Musico("Juninho Afram", "Guitarrista");
        musicos[1] = new Musico("Mauro", "Vocalista");
        musicos[2] = new Musico("Larry", "Baterista");

        Musica[] musicas = new Musica[100];
        musicas[0] = new Musica("O Tempo", 5.2);
        musicas[1] = new Musica("Descanso", 6.1);
        musicas[3] = new Musica("Confiar", 4.4);


        Empresario empresario = new Empresario("Anonimo", "12345678910");

        Banda banda = new Banda("Oficina G3", "Rock", musicos, musicas);
        banda.mostraInfo();
    }
}