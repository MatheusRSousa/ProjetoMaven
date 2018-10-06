package br.unifacisa.si.treinamento;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aluno {
	@Id
	private Long ID = 0L;
	private Integer registro;
	private String nome;
	private String curso;
	
	
	
	public Aluno(Integer registro, String nome, String curso) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.curso = curso;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Integer getRegistro() {
		return registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Aluno [ID=" + ID + ", register=" + registro + ", name=" + nome + ", course=" + curso + "]";
	}
	
	

}
