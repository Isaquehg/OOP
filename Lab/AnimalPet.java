public class AnimalPet {
    String nome, especie, som, comida;
    int idade;

    void comer(){
        System.out.println(nome + " esta comendo " + comida);
    }
    void dormir(int horas){
        System.out.println(nome + " dormira " + horas + " horas.");
    }
    void movimentar(int metros){
        System.out.println(nome + " movimentou " + metros + " metros.");
    }
    void fazerBarulho(){
        System.out.println(nome + " esta " + som);
    }
}
