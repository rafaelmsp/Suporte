package com.rafaelpassos.helpdesk.repositories;

import com.rafaelpassos.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository <Tecnico, Integer> {


}
