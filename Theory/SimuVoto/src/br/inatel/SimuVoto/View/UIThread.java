package br.inatel.SimuVoto.View;

import br.inatel.SimuVoto.Control.ControleVotos;
import br.inatel.SimuVoto.Exceptions.VotoInvalidoException;

import javax.swing.*;
import java.util.HashMap;

public class UIThread extends Thread{
    public UIThread(){
    }
    public void run() {
        //Inserção de votos
        String continuar = "1";
        HashMap<String, Integer> dados = new HashMap();
        while (continuar == "1") {
            JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de votação!");
            String cpf = JOptionPane.showInputDialog("Digite seu CPF");
            String votoString = JOptionPane.showInputDialog("Insira o número do seu candidato");
            dados.put(cpf, Integer.parseInt(votoString));
            continuar = JOptionPane.showInputDialog("Deseja continuar? 1-SIM 2-NAO");
        }
        try {
            ControleVotos.analiseVotos(dados);
        } catch (VotoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Contagem de votos
        JOptionPane.showMessageDialog(null, "Número de votos do candidato Darth Verde: " + ControleVotos.leituraArquivos("/home/isaquehg/Desktop/votos43.txt"));
        JOptionPane.showMessageDialog(null, "Número de votos do candidato Rogerão: " + ControleVotos.leituraArquivos("/home/isaquehg/Desktop/votos51.txt"));
        JOptionPane.showMessageDialog(null, "Número de votos do candidato Paulinho Anão: " + ControleVotos.leituraArquivos("/home/isaquehg/Desktop/votos77.txt"));

    }
}
