public abstract class Personagem implements Movimento{
    protected String cor;
    protected int posX;
    protected int posY;

    public Personagem(String cor, int posX, int posY) {
        this.cor = cor;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void moverCima() {
        //checar se é possível mover p esse lado
        posY += 1;
    }

    @Override
    public void moverBaixo() {
        posY -= 1;
    }

    @Override
    public void moverDireita() {
        posX += 1;
    }

    @Override
    public void moverEsquerda() {
        posX -= 1;
    }
}
