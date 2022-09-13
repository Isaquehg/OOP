public class Main {
    public static void main(String[] args) {
        //ABSTRACT CLASSES 'N FUNCTIONS
        //Itálico no IML
        //É possível criar array de classe abstrata, pois são ponteiros para as classes filhas!!!


        System.out.println("------------------------------------");
        System.out.println("PIZZA HUT");

        //criando pizzas para as unidades
        Pizza[] pizzas = new Pizza[15];
        Pizza pizza1 = new Brasileira();
        Pizza pizza2 = new Pepperoni();
        Pizza pizza3 = new Supreme();

        pizzas[0] = pizza1;
        pizzas[1] = pizza2;
        pizzas[2] = pizza3;

        Pizza[] pizzas2 = new Pizza[15];

        pizzas2[0] = pizza3;
        pizzas2[1] = pizza2;
        pizzas2[2] = pizza1;

        Pizza[] pizzas3 = new Pizza[15];

        pizzas3[0] = pizza2;
        pizzas3[1] = pizza1;
        pizzas3[2] = pizza3;

        //unidades
        Unidade unidadebh = new BH("Avenida", "Larry", pizzas);
        Unidade unidaderj = new RJ("Esquina", "Garry", pizzas2);
        Unidade unidadesp = new SP("Centro", "Darry", pizzas3);

        //output
        unidadebh.mostraPizza();
        unidaderj.mostraPizza();
        unidadesp.mostraPizza();
    }
}
