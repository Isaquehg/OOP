public class CarrinhoDeCompras {
    private String loginCliente;
    private Ingresso[] ingressos = new Ingresso[25];
    private int nIngressos = 0;

    public void addIngresso(Ingresso ingresso){
        for (int i = 0; i < ingressos.length; i++) {
            if(ingressos[i] == null){
                ingressos[i] = ingresso;
                break;
            }
        }
    }

    public void detalhesCompras(){
        float total = 0.0f;
        System.out.println("Total de ingressos: " + nIngressos);
        for (int i = 0; i < nIngressos; i++) {
            if(ingressos[i] != null){
                total += ingressos[i].calculaTotalIngresso();
                nIngressos ++;
            }
        }
        System.out.println("Valor total: " + total);
    }

    public void setLoginCliente(String user){
        loginCliente = user;
    }
}
