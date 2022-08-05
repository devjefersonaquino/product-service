package com.devneutro.serviceproduct.http;

import com.devneutro.serviceproduct.data.request.ProdutoRequest;
import com.devneutro.serviceproduct.data.response.ProdutoResponse;
import com.devneutro.serviceproduct.model.Produto;
import com.devneutro.serviceproduct.service.ProdutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponse inserir(@RequestBody ProdutoRequest dto){
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        Produto produtoPersistido = produtoService.inserir(produto);
        return new ProdutoResponse(produtoPersistido.getId(), produtoPersistido.getDescricao());
    }
}
