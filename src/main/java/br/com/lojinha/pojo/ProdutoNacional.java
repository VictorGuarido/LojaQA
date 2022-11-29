package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    //implementando método descrito no "contrato" Favorito
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e R$" + this.getValor();
    }
}
