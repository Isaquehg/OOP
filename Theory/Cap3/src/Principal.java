public class Principal {
    public static void main(String[] args) {
        float ganho_anual_trab1;

        //instancia dos objetos
        Trabalhador trab1 = new Trabalhador();
        Trabalhador trab2 = new Trabalhador();

        //definindo atributos
        trab1.nome = "Larry";
        trab1.dataNascimento = "01/01/1999";
        trab1.rg = "15641634864";
        trab1.profissao = "Técnico de TI";
        trab1.salario = 2500.00f;

        //aumento de salario
        System.out.println("Salario trab1 s/ aumento: " + trab1.salario);
        trab1.recebeAumento(1500.00f);
        System.out.println("Salario trab1 c/ aumento: " + trab1.salario);

        //infos trab1
        ganho_anual_trab1 = trab1.calculaGanhoAnual();
        System.out.println("Ganho anual trab1: " + ganho_anual_trab1);
        trab1.mostraInfo();

        //definicao de atributos trab2
        trab2.nome = "Darry";
        trab2.dataNascimento = "31/12/1850";
        trab2.rg = "18682873775657";
        trab2.profissao = "Médico";
        trab2.salario = 9500.00f;

        //infos trab2
        trab2.mostraInfo();

        //trab2 apontando p/ trab1: Exclui o objeto original do trab2 e trab2 vai apontar p objeto do trab1
        trab2 = trab1;
        trab2.mostraInfo();
    }
}
