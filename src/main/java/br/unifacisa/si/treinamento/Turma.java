package br.unifacisa.si.treinamento;

import java.util.List;

public class Turma {

	private Long ID;
	private List<Aluno> alunos;
	private List<Sala> sala;
	private Integer periodo;
	
	
	
	public Turma(List<Aluno> alunos, List<Sala> sala, Integer periodo) {
		super();
		this.alunos = alunos;
		this.sala = sala;
		this.periodo = periodo;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public List<Sala> getSala() {
		return sala;
	}
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}
	public Integer getPeeriodo() {
		return periodo;
	}
	public void setPeeriodo(Integer peeriodo) {
		this.periodo = peeriodo;
	}
	@Override
	public String toString() {
		return "Turma [ID=" + ID + ", alunos=" + alunos + ", sala=" + sala + ", peeriodo=" + periodo + "]";
	}
	
	
	
	
}
