package com.rafaelpassos.helpdesk.repositories;

import com.rafaelpassos.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Integer> {
}
