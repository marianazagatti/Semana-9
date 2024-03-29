package br.com.api.farmacia.apirest.repositories;

import br.com.api.farmacia.apirest.entities.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
}
