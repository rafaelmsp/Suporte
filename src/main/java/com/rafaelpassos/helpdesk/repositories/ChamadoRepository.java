package com.rafaelpassos.helpdesk.repositories;

import com.rafaelpassos.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository <Chamado, Integer> {
}
