package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

public class LojinhaApp {
    public static void main(String[] args) {
        ProdutoNacional meuProdNac = new ProdutoNacional("Sony", Tamanho.MEDIO);
        System.out.println(meuProdNac.getMarca());
        meuProdNac.setImpostoNacional(0.12121);
        System.out.println(meuProdNac.getImpostoNacional());

        ProdutoInternacional meuProdInter = new ProdutoInternacional("iPhone", Tamanho.PEQUENO);
        meuProdInter.setTaxaImportacao(0.700);
        System.out.println(meuProdInter.getTaxaImportacao());

        meuProdInter.setValor(100);
    }
}
