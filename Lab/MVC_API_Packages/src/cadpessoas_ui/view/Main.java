package cadpessoas_ui.view;


import cadpessoas.control.TratamentoArquivos;
import cadpessoas_model.model.PessoaFisica;
import cadpessoas_model.model.PessoaJuridica;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String path = "/home/isaquehg/Desktop/cadPessoas.txt";
        String[] pessoaJuridica = new String[4];
        String[] pessoaFisica = new String[5];
        JOptionPane.showMessageDialog(null, "SISTEMA DE CADASTRO DE PESSOAS");
        String operacao = JOptionPane.showInputDialog("Escolha o tipo de operação: 1 - cadFísica  2 - cadJurídica  3 - Dados Salvos");
        int op = Integer.parseInt(operacao);
        if(op == 1){
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
            String endereco = JOptionPane.showInputDialog("Digite o endereco da pessoa");
            String cpf = JOptionPane.showInputDialog("Digite o cpf da pessoa");
            String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa");
            String idade = JOptionPane.showInputDialog("Digite a idade da pessoa");
            int idade_int = Integer.parseInt(idade);

            PessoaFisica pessoaFisica1 = new PessoaFisica(nome, endereco, cpf, idade_int, sexo);

            pessoaFisica[0] = pessoaFisica1.getNome();
            pessoaFisica[1] = pessoaFisica1.getEndereco();
            pessoaFisica[2] = pessoaFisica1.getCpf();
            pessoaFisica[3] = pessoaFisica1.getSexo();
            pessoaFisica[4] = idade;

            try{
                TratamentoArquivos.escritaArquivos(pessoaFisica, path);
            }
            catch (Exception e){
                System.out.println("Ocorreu um erro ao gravar os dados");
            }
        }
        else if(op == 2){
            String nome = JOptionPane.showInputDialog("Digite o nome da empresa");
            String endereco = JOptionPane.showInputDialog("Digite o endereço da empresa");
            String cnpj = JOptionPane.showInputDialog("Digite o cnpj da empresa");
            String ramo = JOptionPane.showInputDialog("Digite o ramo da empresa");

            PessoaJuridica pessoaJuridica1 = new PessoaJuridica(nome, endereco, ramo, cnpj);

            pessoaJuridica[0] = pessoaJuridica1.getNome();
            pessoaJuridica[1] = pessoaJuridica1.getEndereco();
            pessoaJuridica[2] = pessoaJuridica1.getCnpj();
            pessoaJuridica[3] = pessoaJuridica1.getRamo();

            try{
                TratamentoArquivos.escritaArquivos(pessoaJuridica, path);
            }
            catch (Exception e){
                System.out.println("Ocorreu um erro ao gravar os dados");
            }
        }
        else if (op == 3) {
            TratamentoArquivos.leituraArquivos(path);
        } else{
            System.out.println("Entrada não válida");
        }
    }
}