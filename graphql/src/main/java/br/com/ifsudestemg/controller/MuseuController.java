package br.com.ifsudestemg.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import br.com.ifsudestemg.dao.DAO;
import br.com.ifsudestemg.dao.AgendamentoDAO;
import br.com.ifsudestemg.model.Museu;
import br.com.ifsudestemg.model.Agendamento;

@Controller
public class MuseuController {

    @QueryMapping
    public List<Museu> museus() {
        DAO<Museu> dao = new DAO<>(Museu.class);
        return dao.listaTodos();
    }

    @SchemaMapping
    public List<Agendamento> agendamentos(Museu museu, @Argument String data) {
        if (data != null) {
            AgendamentoDAO dao = new AgendamentoDAO();
            return dao.buscarPorMuseuEData(museu.getId(), LocalDate.parse(data));
        }
        return new ArrayList<>();
    }
}