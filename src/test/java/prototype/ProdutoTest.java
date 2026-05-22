package prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveClonarProdutoEAlterarApenasDadosEspecificos() throws CloneNotSupportedException {

        ConfiguracaoFiscal configInformatica = new ConfiguracaoFiscal("Informática", 18.0);
        Produto notebookI5 = new Produto("NOTE-DELL-I5", "Notebook Dell i5", 4500.0f, configInformatica);


        Produto notebookI7 = notebookI5.clone();
        notebookI7.setSku("NOTE-DELL-I7");
        notebookI7.setNome("Notebook Dell i7");
        notebookI7.setPreco(6500.0f);


        notebookI7.getConfiguracaoFiscal().setImpostoPercentual(20.0);


        assertEquals("Produto{sku='NOTE-DELL-I5', nome='Notebook Dell i5', preco=4500.0, configuracaoFiscal=ConfiguracaoFiscal{categoria='Informática', impostoPercentual=18.0%}}", notebookI5.toString());

        assertEquals("Produto{sku='NOTE-DELL-I7', nome='Notebook Dell i7', preco=6500.0, configuracaoFiscal=ConfiguracaoFiscal{categoria='Informática', impostoPercentual=20.0%}}", notebookI7.toString());
    }
}