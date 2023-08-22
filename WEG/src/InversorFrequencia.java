public class InversorFrequencia extends ProdutoWeg{
    private String capacidadeFrequencia;
    private int numFases;

    public InversorFrequencia(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco, String capacidadeFrequencia, int numFases) {
        super(nome, codigo, tipo, potencia, tensao, capacidade, preco);
        this.capacidadeFrequencia = capacidadeFrequencia;
        this.numFases = numFases;
    }

    public String getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    public void setCapacidadeFrequencia(String capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    public int getNumFases() {
        return numFases;
    }

    public void setNumFases(int numFases) {
        this.numFases = numFases;
    }
}
