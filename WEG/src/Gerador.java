/**
 * Classe que representa um gerador, uma subclasse de ProdutoWeg.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class Gerador extends ProdutoWeg {
    // Atributos adicionais da classe Gerador
    private String tipoCombustivel; // Tipo de combustível do gerador
    private float autonomia;        // Autonomia do gerador

    /**
     * Construtor da classe Gerador para inicializar os atributos do gerador e herdados de ProdutoWeg.
     *
     * @param nome O nome do gerador.
     * @param codigo O código do gerador.
     * @param tipo O tipo do gerador.
     * @param potencia A potência do gerador.
     * @param tensao A tensão do gerador.
     * @param capacidade A capacidade do gerador.
     * @param preco O preço do gerador.
     * @param tipoCombustivel O tipo de combustível do gerador.
     * @param autonomia A autonomia do gerador.
     */
    public Gerador(String nome, int codigo, String tipo, float potencia, float tensao, float capacidade, float preco, String tipoCombustivel, float autonomia) {
        // Chama o construtor da superclasse ProdutoWeg para inicializar os atributos herdados.
        super(nome, codigo, tipo, potencia, tensao, capacidade, preco);
        // Inicializa os atributos específicos do gerador.
        this.tipoCombustivel = tipoCombustivel;
        this.autonomia = autonomia;
    }

    /**
     * Obtém o tipo de combustível do gerador.
     *
     * @return O tipo de combustível do gerador.
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Define o tipo de combustível do gerador.
     *
     * @param tipoCombustivel O novo tipo de combustível do gerador.
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * Obtém a autonomia do gerador.
     *
     * @return A autonomia do gerador.
     */
    public float getAutonomia() {
        return autonomia;
    }

    /**
     * Define a autonomia do gerador.
     *
     * @param autonomia A nova autonomia do gerador.
     */
    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }
}