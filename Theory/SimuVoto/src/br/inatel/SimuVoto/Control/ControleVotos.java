package br.inatel.SimuVoto.Control;

import br.inatel.SimuVoto.Exceptions.VotoInvalidoException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ControleVotos {
    //Selecionando arquivo a ser escrito de acordo com o voto
    public static void analiseVotos(HashMap<String, Integer> dados){
        ArrayList<String> votos77 = new ArrayList();
        ArrayList<String> votos51 = new ArrayList();
        ArrayList<String> votos43 = new ArrayList();
        for(String i : dados.keySet())
            if(i.matches("[0-9]{11}")){
                if(dados.get(i) == 77){
                    votos77.add(i);
                }
                else if(dados.get(i) == 51){
                    votos51.add(i);
                }
                else if(dados.get(i) == 43){
                    votos43.add(i);
                }
                else{
                    throw new VotoInvalidoException("Número Inválido!");
                }
            }
        else{
            throw new VotoInvalidoException("CPF invalido!");
        }
        //Escrita após análise
        escritaArquivos(votos77, "/home/isaquehg/Desktop/votos77.txt");
        escritaArquivos(votos51, "/home/isaquehg/Desktop/votos51.txt");
        escritaArquivos(votos43, "/home/isaquehg/Desktop/votos43.txt");
    }
    public static int leituraArquivos(String path){
        ArrayList<String> cpfs = new ArrayList();
        InputStream fluxoEntrada = null;
        InputStreamReader leitorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;
        String linha = null;
        try {
            fluxoEntrada = new FileInputStream(path);
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);
            linha = bufferEntrada.readLine();
            while (linha != null){
                cpfs.add(linha);
                System.out.println(linha);
                linha = bufferEntrada.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found error: " + e);
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        finally {
            try{
                bufferEntrada.close();
            }
            catch (IOException e){
                System.out.println("IOException close: " + e);
            }
        }
        return cpfs.size();
    }
    public static void escritaArquivos(ArrayList<String> dados, String path){
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        try {
            fluxoSaida = new FileOutputStream(path);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            for (int i = 0; i < dados.size(); i++) {
                bufferSaida.write(dados.get(i));
                bufferSaida.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found error: " + e);
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        finally {
            try{
                bufferSaida.close();
            }
            catch (IOException e){
                System.out.println("IOException close: " + e);
            }
        }
    }
}
