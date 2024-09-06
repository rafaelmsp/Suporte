package com.rafaelpassos.helpdesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Tecnico extends Pessoa {

    @Serial
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    // Construtor sem argumentos (necessário para o JPA e Hibernate)
    public Tecnico() {
        super(); // Chama o construtor da superclasse Pessoa
    }

    // Construtor com argumentos
    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha); // Chama o construtor da superclasse Pessoa
    }
}
