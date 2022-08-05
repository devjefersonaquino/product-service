package com.devneutro.serviceproduct.data.response;

public class ProdutoResponse {

    private final Long id;
    private final String descricao;

    public ProdutoResponse(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
