public class VIP extends Ingresso{
    protected String tamanho;

    public VIP(float valorIngresso) {
        super(valorIngresso);
    }

    public void mostraInfos(){
        super.mostraInfo();
        System.out.println("Tamanho: " + tamanho);
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
