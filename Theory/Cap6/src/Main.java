public class Main {
    public static void main(String[] args) {
        /*
        Seta triangular: Herança
        +: Public
        -: Private
        #: Protected(apenas classes filhas podem acessar)

        @override -> sobrescreve um método da classe mãe
        super(método) -> reaproveita método da classe mãe

        Herança -> extends
        Polimorfismo -> instanceof
        */

        System.out.println("-------------------------------------------------");
        System.out.println("EX1 - JAVA_ZOO");

        Coruja coruja1 = new Coruja();
        coruja1.nome = "Merry";
        coruja1.cor = "Marrom";
        coruja1.nPatas = 2;
        coruja1.setAlturaVoo(25);

        Peixe peixe1 = new Peixe();
        peixe1.nome = "Perry";
        peixe1.cor = "Azul";
        peixe1.nPatas = 0;
        peixe1.setnBarbatanas(2);

        Leao leao1 = new Leao();
        leao1.nome = "Larry";
        leao1.cor = "Caramelo";
        leao1.nPatas = 4;
        leao1.setTamanhoJuba(12.5f);

        Pato pato1 = new Pato();
        pato1.nome = "Garry";
        pato1.cor = "Amarelo";
        pato1.nPatas = 2;
        pato1.setTamanhoBico(15.0f);

        Animal[] animais = new Animal[25];
        animais[0] = coruja1;
        animais[1] = peixe1;
        animais[2] = leao1;
        animais[3] = pato1;

        Zoologico zoo1 = new Zoologico("Zoo", "Av. dos Animais", animais);

        //output
        for (int i = 0; i < zoo1.getAnimais().length; i++) {
            if(zoo1.getAnimais()[i] != null) {
                System.out.println("-------------------------------------------------");
                System.out.println("Nome: " + zoo1.getAnimais()[i].nome);
                System.out.println("Cor: " + zoo1.getAnimais()[i].cor);
                System.out.println("Num patas: " + zoo1.getAnimais()[i].nPatas);
                zoo1.getAnimais()[i].fazBarulho();

                //tratando os elementos da array de forma específica
                //se o elemento da array for uma instância de:
                if(zoo1.getAnimais()[i] instanceof Coruja){
                    //cria um objeto mais específico
                    Coruja coruja_aux = (Coruja) zoo1.getAnimais()[i];
                    System.out.println("Altura de voo: " + coruja_aux.getAlturaVoo());
                }
                else if(zoo1.getAnimais()[i] instanceof Leao){
                    Leao leao_aux = (Leao) zoo1.getAnimais()[i];
                    System.out.println("Tamanho da juba: " + leao_aux.getTamanhoJuba());
                }
            }
        }


        System.out.println("-------------------------------------------------");
        System.out.println("EVENTOS");
/*
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        carrinho1.setLoginCliente("Larry");

        Ingresso ingresso1 = new Ingresso(225.59f);
        Ingresso ingresso2 = new Ingresso(225.59f);

        carrinho1.detalhesCompras();*/
    }
}