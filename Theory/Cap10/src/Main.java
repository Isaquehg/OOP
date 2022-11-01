public class Main {
    public static void main(String[] args) {
        //Checked Exceptions -> Must be treated (Doesn't allow Throws) -> Exception
        //Unchecked -> Allows Throws -> RuntimeException
        //Throw lança uma exceção customizada
        //Throws posterga uma exceção
        System.out.println("-----------------------------");
        System.out.println("CADASTRO CONTROLADO");

        //Instances
        Cadastro cadastro1 = new Cadastro();
        String[] codigos = new String[10];
        codigos[0] = "mp-a777";
        codigos[1] = "ah-8877";
        codigos[2] = "45-aat7";
        codigos[3] = "p-a88";
        codigos[4] = "r9-1900";
        codigos[5] = "1111111";

        for (int i = 0; i < codigos.length; i++) {
            if(codigos[i] != null) {
                //Try/Catch/Finally
                try {
                    cadastro1.addCodigo(codigos[i]);
                } catch (CodigoInvalidoException e) {
                    //Use .err instead of .out to change output colour to Red
                    System.err.println(e.getMessage());
                } finally {
                    cadastro1.mostraCodigos();
                }
            }
        }
    }
}