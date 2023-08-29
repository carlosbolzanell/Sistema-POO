/**
 * A classe MotorEletrico representa um motor elétrico fabricado pela empresa WEG.
 * Ela herda características da classe ProdutoWeg e adiciona informações específicas de motores elétricos.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class MotorEletrico extends ProdutoWeg {
    private String tipoEnrolamento; // O tipo de enrolamento do motor elétrico.
    private String eficiencia; // A eficiência do motor elétrico.

    /**
     * Construtor da classe MotorEletrico.
     *
     * @param nome            O nome do motor elétrico.
     * @param codigo          O código identificador do motor elétrico.
     * @param tipo            O tipo de produto do motor elétrico.
     * @param potencia        A potência do motor elétrico.
     * @param tensao          A tensão de operação do motor elétrico.
     * @param capacidade      A capacidade do motor elétrico.
     * @param preco           O preço do motor elétrico.
     * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
     * @param eficiencia      A eficiência do motor elétrico.
     */
    public MotorEletrico(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco, String tipoEnrolamento, String eficiencia) {
        // Chama o construtor da classe pai (ProdutoWeg) para inicializar as características gerais.
        super(nome, codigo, tipo, potencia, tensao, capacidade, preco);
        this.tipoEnrolamento = tipoEnrolamento;
        this.eficiencia = eficiencia;
    }

    /**
     * Obtém o tipo de enrolamento do motor elétrico.
     *
     * @return O tipo de enrolamento.
     */
    public String getTipoEnrolamento() {
        return tipoEnrolamento;
    }

    /**
     * Define o tipo de enrolamento do motor elétrico.
     *
     * @param tipoEnrolamento O novo tipo de enrolamento.
     */
    public void setTipoEnrolamento(String tipoEnrolamento) {
        this.tipoEnrolamento = tipoEnrolamento;
    }

    /**
     * Obtém a eficiência do motor elétrico.
     *
     * @return A eficiência do motor elétrico.
     */
    public String getEficiencia() {
        return eficiencia;
    }

    /**
     * Define a eficiência do motor elétrico.
     *
     * @param eficiencia A nova eficiência do motor elétrico.
     */
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
}
