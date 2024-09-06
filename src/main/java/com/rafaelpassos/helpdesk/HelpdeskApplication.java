package com.rafaelpassos.helpdesk;

import com.rafaelpassos.helpdesk.domain.Chamado;
import com.rafaelpassos.helpdesk.domain.Cliente;
import com.rafaelpassos.helpdesk.domain.Tecnico;
import com.rafaelpassos.helpdesk.domain.enums.Perfil;
import com.rafaelpassos.helpdesk.domain.enums.Prioridade;
import com.rafaelpassos.helpdesk.domain.enums.Status;
import com.rafaelpassos.helpdesk.repositories.ChamadoRepository;
import com.rafaelpassos.helpdesk.repositories.ClienteRepository;
import com.rafaelpassos.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

@Autowired
private TecnicoRepository tecnicoRepository;
@Autowired
private ClienteRepository clienteRepository;
@Autowired
private ChamadoRepository chamadoRepository;


    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Tecnico tec1 = new Tecnico(null,
                "Valdir Guimarães",
                "17648542696",
                "operacoes@gmail.com",
                "123");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null,
                "linus Torvalds",
                "17598745621",
                "linux@gmail.com",
                "21965669055",
                null);
        cli1.addPerfil((Perfil.CLIENTE));

        Chamado C1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(C1));





    }



}
