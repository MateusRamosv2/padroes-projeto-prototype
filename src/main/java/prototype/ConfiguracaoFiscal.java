package prototype;

public class ConfiguracaoFiscal implements Cloneable {
    private String categoria;
    private double impostoPercentual;

    public ConfiguracaoFiscal(String categoria, double impostoPercentual) {
        super();
        this.categoria = categoria;
        this.impostoPercentual = impostoPercentual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getImpostoPercentual() {
        return impostoPercentual;
    }

    public void setImpostoPercentual(double impostoPercentual) {
        this.impostoPercentual = impostoPercentual;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ConfiguracaoFiscal{" +
                "categoria='" + categoria + '\'' +
                ", impostoPercentual=" + impostoPercentual +
                "%}";
    }
}