package br.com.fiap.piggybank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.piggybank.models.Despesa;

public interface DespesaRespository extends JpaRepository<Despesa, Long> {
    
}
