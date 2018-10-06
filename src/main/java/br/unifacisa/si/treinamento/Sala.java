package br.unifacisa.si.treinamento;

import java.util.List;

public class Sala {
	
	private Integer numero;
	private List<Aluno> alunos;
	private Boolean disponibilidade;
	private Integer capacidade;
	private Long ID;
	
	
	public Sala(Integer numero, Boolean disponibilidade, Integer capacidade) {
		super();
		this.numero = numero;
		this.disponibilidade = disponibilidade;
		this.capacidade = capacidade;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", alunos=" + alunos + ", disponibilidade=" + disponibilidade
				+ ", capacidade=" + capacidade + ", ID=" + ID + "]";
	}

	
}
