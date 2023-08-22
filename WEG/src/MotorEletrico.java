public class MotorEletrico extends ProdutoWeg{
    private String tipoEnrolamento;
    private String eficiencia;

    public MotorEletrico(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco, String tipoEnrolamento, String eficiencia) {
        super(nome, codigo, tipo, potencia, tensao, capacidade, preco);
        this.tipoEnrolamento = tipoEnrolamento;
        this.eficiencia = eficiencia;
    }

    public String getTipoEnrolamento() {
        return tipoEnrolamento;
    }

    public void setTipoEnrolamento(String tipoEnrolamento) {
        this.tipoEnrolamento = tipoEnrolamento;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
}
