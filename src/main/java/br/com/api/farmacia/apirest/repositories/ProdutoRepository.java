package br.com.api.farmacia.apirest.repositories;

import br.com.api.farmacia.apirest.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
