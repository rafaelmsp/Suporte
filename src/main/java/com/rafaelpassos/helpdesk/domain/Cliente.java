package com.rafaelpassos.helpdesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Setter

@Entity
public class Cliente extends Pessoa {
    @Serial
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();


    public Cliente(Integer id, String nome, String cpf, String email, String telefone, List<Chamado> chamados) {
        super(id, nome, cpf, email, telefone);

    }

    public Cliente(List<Chamado> chamados) {

    }

}
