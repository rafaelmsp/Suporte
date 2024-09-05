package com.rafaelpassos.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rafaelpassos.helpdesk.domain.enums.Perfil;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public abstract class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Setter@Getter@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Setter@Getter
    protected String nome;
    @Setter@Getter@Column(unique = true)
    protected String cpf;
    @Setter@Getter@Column(unique = true)
    protected String email;
    @Setter@Getter
    protected String senha;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PERFIS")
    protected Set<Perfil> perfis = new HashSet<>();
    @JsonFormat(pattern = "dd/MM/yy")
    protected LocalDate dataCriacao = LocalDate.now();


    public Pessoa() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Pessoa(Integer id, String nome, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }



}
