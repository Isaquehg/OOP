import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    public List<String> codigosValidos = new ArrayList<>();
    public List<String> codigosInvalidos = new ArrayList<>();

    public Cadastro(){
    }

    public void addCodigo(String codigo){
        if(codigo.matches("[a-z0-9]{2}-[a-z0-9]{4}")) {
            codigosValidos.add(codigo);
            System.out.println("Código cadastrado com sucesso!");
        }
        else{
            codigosInvalidos.add(codigo);
            throw new CodigoInvalidoException("Não corresponde ao padrão");
        }
    }
    public void mostraCodigos(){
        System.out.println(codigosValidos);
    }
}
