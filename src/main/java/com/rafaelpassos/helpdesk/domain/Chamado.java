package com.rafaelpassos.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rafaelpassos.helpdesk.domain.enums.Prioridade;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Chamado implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private String titulo;
    private String observações;
    @ManyToOne

    @JoinColumn (name= "tecnico_id")
    private Tecnico tecnico;
    @JoinColumn (name= "cliente_id")
    private Cliente cliente;
    public Chamado() {
        super();
    }

    public Chamado(Integer id, Prioridade prioridade, String titulo,
                   String observações, Tecnico tecnico, Cliente cliente) {

        this.id = id;
        this.prioridade = prioridade;
        this.titulo = titulo;
        this.observações = observações;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chamado chamado = (Chamado) o;
        return Objects.equals(id, chamado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


