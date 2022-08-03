public class ClassePrincipal {
    public static void main(String[] args) {
        //!!! É necessário criar um ponteiro para manipular o objeto
        Pessoa p1 = new Pessoa();
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf = "12345678910";
        p1.comer();

        Pessoa p2 = new Pessoa();
        p2.nome = "Isaque";
        p2.idade = 19;
        p2.cpf = "12345678900";
        p2.dormir();

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf = "12345678900";
        p3.tomarAgua();

        //JavaPets
        AnimalPet pet1 = new AnimalPet();
        pet1.nome = "Larry";
        pet1.comida = "Ração";
        pet1.comer();
        pet1.dormir(5);

        AnimalPet pet2 = new AnimalPet();
        pet2.nome = "Godofredo";
        pet2.especie = "Salsicha";
        pet2.som = "latindo";
        pet2.fazerBarulho();
        pet2.movimentar(5);

    }
}
