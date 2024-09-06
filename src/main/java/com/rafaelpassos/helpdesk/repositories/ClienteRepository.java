package com.rafaelpassos.helpdesk.repositories;

import com.rafaelpassos.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
}
