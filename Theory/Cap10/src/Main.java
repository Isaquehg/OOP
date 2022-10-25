public class Main {
    public static void main(String[] args) {
        //Checked Exceptions -> Must be treated (Doesn't allow Throws)
        //Unchecked -> Allows Throws
        //Throw lança uma exceção customizada
        //Throws posterga uma exceção
        System.out.println("-----------------------------");
        System.out.println("CADASTRO CONTROLADO");

        //Instances
        Cadastro cadastro1 = new Cadastro();
        String codigo1 = "mp-a777";

        //Try/Catch/Finally
        try{
            cadastro1.addCodigo(codigo1);
        }
        catch (CodigoInvalidoException e){
            System.out.println(e.getMessage());
        }
        finally {
            cadastro1.mostraCodigos();
        }
    }
}