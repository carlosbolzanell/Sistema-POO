/**
 * Classe que representa um serviço de manutenção.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class ServicoManutencao {
    // Atributos privados da classe
    private String descricao; // Descrição do serviço
    private float custo;     // Custo do serviço

    /**
     * Construtor da classe para inicializar a descrição e o custo do serviço.
     *
     * @param descricao A descrição do serviço.
     * @param custo O custo do serviço.
     */
    public ServicoManutencao(String descricao, float custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    /**
     * Obtém a descrição do serviço.
     *
     * @return A descrição do serviço.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do serviço.
     *
     * @param descricao A nova descrição do serviço.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço.
     *
     * @return O custo do serviço.
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo do serviço.
     *
     * @param custo O novo custo do serviço.
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
}
