public class Camarote extends Ingresso{
    private int tamanhoCamiseta;

    public Camarote(float valorIngresso) {
        super(valorIngresso);
    }

    @Override
    public void MostraInfos(){
        //REAPROVEITA PARTES DA CLASSE MÃE
        super.mostraInfo();
        System.out.println("Tamanho da camiseta: " + tamanhoCamiseta);
    }

    public void setTamanhoCamiseta(int tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }
}
