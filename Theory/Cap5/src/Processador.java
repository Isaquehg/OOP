public class Processador {
    private String marca;
    private float freq_Processamento;

    public Processador(String marca, float freq_Processamento) {
        this.marca = marca;
        this.freq_Processamento = freq_Processamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFreq_Processamento() {
        return freq_Processamento;
    }

    public void setFreq_Processamento(float freq_Processamento) {
        this.freq_Processamento = freq_Processamento;
    }
}
