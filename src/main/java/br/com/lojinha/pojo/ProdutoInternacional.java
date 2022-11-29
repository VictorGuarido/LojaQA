package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{

    private double taxaImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public void setValor(double novoValor) {
        if (novoValor > -100){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devems ser maiores que -100");
        }
    }
}
