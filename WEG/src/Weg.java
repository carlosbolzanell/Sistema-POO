import java.util.ArrayList;

/**
 * A classe Weg representa a empresa WEG e contém listas de produtos disponíveis e serviços de manutenção.
 * @author Carlos Eduardo Bolzanell
 * @version 1.0
 */
public class Weg {
    private ArrayList<ProdutoWeg> produtosDisponiveis = new ArrayList<ProdutoWeg>(); // Lista de produtos disponíveis da WEG.
    private ArrayList<ServicoManutencao> servicos = new ArrayList<ServicoManutencao>(); // Lista de serviços de manutenção da WEG.

    /**
     * Obtém a lista de produtos disponíveis da WEG.
     *
     * @return A lista de produtos disponíveis.
     */
    public ArrayList<ProdutoWeg> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    /**
     * Adiciona um produto à lista de produtos disponíveis.
     *
     * @param produto O produto a ser adicionado.
     */
    public void addProdutosDisponiveis(ProdutoWeg produto) {
        this.produtosDisponiveis.add(produto);
    }

    /**
     * Remove um produto da lista de produtos disponíveis.
     *
     * @param produto O produto a ser removido.
     */
    public void removeProdutosDisponiveis(ProdutoWeg produto) {
        this.produtosDisponiveis.remove(produto);
    }

    /**
     * Obtém a lista de serviços de manutenção da WEG.
     *
     * @return A lista de serviços de manutenção.
     */
    public ArrayList<ServicoManutencao> getServicos() {
        return servicos;
    }

    /**
     * Adiciona um serviço de manutenção à lista de serviços.
     *
     * @param produto O serviço de manutenção a ser adicionado.
     */
    public void addServicos(ServicoManutencao produto) {
        this.servicos.add(produto);
    }

    /**
     * Remove um serviço de manutenção da lista de serviços.
     *
     * @param produto O serviço de manutenção a ser removido.
     */
    public void removeServicos(ServicoManutencao produto) {
        this.servicos.remove(produto);
    }
}
}
