/**
 * A classe InversorFrequencia representa um inversor de frequência fabricado pela empresa WEG.
 * Ela herda características da classe ProdutoWeg e adiciona informações específicas de inversores de frequência.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class InversorFrequencia extends ProdutoWeg {
    private String capacidadeFrequencia; // A capacidade de frequência do inversor.
    private int numFases; // O número de fases do inversor.

    /**
     * Construtor da classe InversorFrequencia.
     *
     * @param nome                O nome do inversor de frequência.
     * @param codigo              O código identificador do inversor de frequência.
     * @param tipo                O tipo de produto do inversor de frequência.
     * @param potencia            A potência do inversor de frequência.
     * @param tensao              A tensão de operação do inversor de frequência.
     * @param capacidade          A capacidade do inversor de frequência.
     * @param preco               O preço do inversor de frequência.
     * @param capacidadeFrequencia A capacidade de frequência do inversor.
     * @param numFases            O número de fases do inversor.
     */
    public InversorFrequencia(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco, String capacidadeFrequencia, int numFases) {
        // Chama o construtor da classe pai (ProdutoWeg) para inicializar as características gerais.
        super(nome, codigo, tipo, potencia, tensao, capacidade, preco);
        this.capacidadeFrequencia = capacidadeFrequencia;
        this.numFases = numFases;
    }

    /**
     * Obtém a capacidade de frequência do inversor de frequência.
     *
     * @return A capacidade de frequência.
     */
    public String getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    /**
     * Define a capacidade de frequência do inversor de frequência.
     *
     * @param capacidadeFrequencia A nova capacidade de frequência.
     */
    public void setCapacidadeFrequencia(String capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    /**
     * Obtém o número de fases do inversor de frequência.
     *
     * @return O número de fases.
     */
    public int getNumFases() {
        return numFases;
    }

    /**
     * Define o número de fases do inversor de frequência.
     *
     * @param numFases O novo número de fases.
     */
    public void setNumFases(int numFases) {
        this.numFases = numFases;
    }

    /**
     * Realiza a manutenção do Inversor de Frequência
     *
     * @param servico Serviço de Manutenção utilizada
     */
    public String realizarManutencao(ServicoManutencao servico) {
        return "A manutenção foi realizada no Inversor de Frequência "+getNome()+" com sucesso!";
    }
}
