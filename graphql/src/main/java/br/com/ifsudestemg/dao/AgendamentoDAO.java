package br.com.ifsudestemg.dao;

import java.time.LocalDate;
import java.util.List;

import br.com.ifsudestemg.model.Agendamento;
import br.com.ifsudestemg.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class AgendamentoDAO extends DAO<Agendamento> {

    public AgendamentoDAO() {
        super(Agendamento.class);
    }

    public Agendamento buscarPorCodigo(String codigo) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String jpql = "SELECT a FROM Agendamento a WHERE a.codigoConfirmacao = :codigo";
            TypedQuery<Agendamento> query = em.createQuery(jpql, Agendamento.class);
            query.setParameter("codigo", codigo);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public List<Agendamento> buscarPorMuseuEData(Long museuId, LocalDate data) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String jpql = "SELECT a FROM Agendamento a WHERE a.museu.id = :museuId AND a.dataVisita = :data";
            TypedQuery<Agendamento> query = em.createQuery(jpql, Agendamento.class);
            query.setParameter("museuId", museuId);
            query.setParameter("data", data);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}