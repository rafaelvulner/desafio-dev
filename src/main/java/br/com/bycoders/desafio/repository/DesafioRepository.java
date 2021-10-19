package br.com.bycoders.desafio.repository;

import br.com.bycoders.desafio.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesafioRepository extends JpaRepository<Transacao, Integer> {
}
