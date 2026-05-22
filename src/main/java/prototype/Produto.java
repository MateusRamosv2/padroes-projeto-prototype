package prototype;

public class Produto implements Cloneable {
    private String sku;
    private String nome;
    private float preco;
    private ConfiguracaoFiscal configuracaoFiscal;

    public Produto(String sku, String nome, float preco, ConfiguracaoFiscal configuracaoFiscal) {
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
        this.configuracaoFiscal = configuracaoFiscal;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ConfiguracaoFiscal getConfiguracaoFiscal() {
        return configuracaoFiscal;
    }

    public void setConfiguracaoFiscal(ConfiguracaoFiscal configuracaoFiscal) {
        this.configuracaoFiscal = configuracaoFiscal;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();

        produtoClone.configuracaoFiscal = (ConfiguracaoFiscal) produtoClone.configuracaoFiscal.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", configuracaoFiscal=" + configuracaoFiscal +
                '}';
    }
}