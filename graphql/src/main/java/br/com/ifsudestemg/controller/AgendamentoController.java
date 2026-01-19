package br.com.ifsudestemg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import br.com.ifsudestemg.dao.AgendamentoDAO;
import br.com.ifsudestemg.model.Agendamento;
import br.com.ifsudestemg.model.ResumoMuseu;

@Controller
public class AgendamentoController {

    @QueryMapping
    public Agendamento agendamento(@Argument String codigo) {
        AgendamentoDAO dao = new AgendamentoDAO();
        return dao.buscarPorCodigo(codigo);
    }
    
    @SchemaMapping
    public Integer quantidadePessoas(Agendamento agendamento) {
        if (agendamento.getPessoas() != null) {
            return agendamento.getPessoas().size();
        }
        return 0;
    }

    @QueryMapping
    public ResumoMuseu resumoMuseu(@Argument Long museuId, @Argument String data) {
        AgendamentoDAO dao = new AgendamentoDAO();
        List<Agendamento> lista = dao.buscarPorMuseuEData(museuId, LocalDate.parse(data));
        
        int totalAgendamentos = lista.size();
        int totalPessoas = 0;
        
        for (Agendamento a : lista) {
            if (a.getPessoas() != null) {
                totalPessoas += a.getPessoas().size();
            }
        }
        
        return new ResumoMuseu(totalAgendamentos, totalPessoas);
    }
}