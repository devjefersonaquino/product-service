package com.devneutro.serviceproduct.data.request;

import java.math.BigDecimal;

public class ProdutoRequest {

    private String descricao;

    private BigDecimal valor;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
