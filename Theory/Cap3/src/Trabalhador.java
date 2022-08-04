public class Trabalhador {
    String nome, rg, profissao, dataNascimento;
    float salario;

    void recebeAumento(float valor){
        salario += valor;
    }
    float calculaGanhoAnual(){
        float total;
        total = salario * 13;

        return total;
    }
    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Profissão: " + profissao);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);
    }

}
