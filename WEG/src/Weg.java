import java.util.ArrayList;

public class Weg {
    private ArrayList<ProdutoWeg> produtosDisponiveis = new ArrayList<ProdutoWeg>();
    private ArrayList<ServicoManutencao> servicos = new ArrayList<ServicoManutencao>();

    public ArrayList<ProdutoWeg> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void addProdutosDisponiveis(ProdutoWeg produto) {
        this.produtosDisponiveis.add(produto);
    }
    public void removeProdutosDisponiveis(ProdutoWeg produto){
        this.produtosDisponiveis.remove(produto);
    }

    public ArrayList<ServicoManutencao> getServicos() {
        return servicos;
    }

    public void addServicos(ServicoManutencao produto) {
        this.servicos.add(produto);
    }
    public void removeServicos(ServicoManutencao produto) {
        this.servicos.remove(produto);
    }
}
