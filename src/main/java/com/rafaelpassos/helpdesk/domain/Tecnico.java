package com.rafaelpassos.helpdesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Tecnico extends Pessoa{ @Serial
private static final long serialVersionUID = 1L;

    @OneToMany (mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
    }

}
