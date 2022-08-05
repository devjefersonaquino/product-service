package com.devneutro.serviceproduct.repository;

import com.devneutro.serviceproduct.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
