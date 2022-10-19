package cadpessoas.control;
import java.io.*;

public class TratamentoArquivos {
    public static void leituraArquivos(String path){
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
    }
    public static void escritaArquivos(String[] dados, String path){
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        try {
            fluxoSaida = new FileOutputStream(path);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            for (int i = 0; i < dados.length; i++) {
                bufferSaida.write(dados[i]);
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
