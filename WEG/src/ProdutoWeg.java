/**
 * A classe ProdutoWeg é uma classe base que representa um produto fabricado pela empresa WEG.
 * Ela contém informações gerais que podem ser compartilhadas entre diferentes tipos de produtos da empresa.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class ProdutoWeg {
    private String nome; // O nome do produto.
    private int codigo; // O código identificador do produto.
    private String tipo; // O tipo de produto.
    private float potencia; // A potência do produto.
    private float tensao; // A tensão de operação do produto.
    private float capacidade; // A capacidade do produto.
    private float preco; // O preço do produto.

    /**
     * Construtor da classe ProdutoWeg.
     *
     * @param nome      O nome do produto.
     * @param codigo    O código identificador do produto.
     * @param tipo      O tipo de produto.
     * @param potencia  A potência do produto.
     * @param tensao    A tensão de operação do produto.
     * @param capacidade A capacidade do produto.
     * @param preco     O preço do produto.
     */
    public ProdutoWeg(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.tensao = tensao;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    /**
     * Construtor vazio da classe ProdutoWeg.
     */
    public ProdutoWeg() {
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o código identificador do produto.
     *
     * @return O código identificador do produto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código identificador do produto.
     *
     * @param codigo O novo código identificador do produto.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o tipo de produto.
     *
     * @return O tipo de produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de produto.
     *
     * @param tipo O novo tipo de produto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto.
     *
     * @return A potência do produto.
     */
    public float getPotencia() {
        return potencia;
    }

    /**
     * Define a potência do produto.
     *
     * @param potencia A nova potência do produto.
     */
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão de operação do produto.
     *
     * @return A tensão de operação do produto.
     */
    public float getTensao() {
        return tensao;
    }

    /**
     * Define a tensão de operação do produto.
     *
     * @param tensao A nova tensão de operação do produto.
     */
    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto.
     *
     * @return A capacidade do produto.
     */
    public float getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do produto.
     *
     * @param capacidade A nova capacidade do produto.
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O novo preço do produto.
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}