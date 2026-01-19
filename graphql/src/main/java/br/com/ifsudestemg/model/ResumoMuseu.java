package br.com.ifsudestemg.model;

public class ResumoMuseu {
    private int totalAgendamentos;
    private int totalPessoas;

    public ResumoMuseu(int totalAgendamentos, int totalPessoas) {
        this.totalAgendamentos = totalAgendamentos;
        this.totalPessoas = totalPessoas;
    }

    public int getTotalAgendamentos() { return totalAgendamentos; }
    public int getTotalPessoas() { return totalPessoas; }
}