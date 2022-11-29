package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

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

    //implementando método descrito no "contrato" Favorito
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e R$" + this.getValor();
    }
}
