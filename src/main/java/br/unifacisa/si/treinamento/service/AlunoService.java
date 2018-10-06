package br.unifacisa.si.treinamento.service;

import br.unifacisa.si.treinamento.repository.*;

import java.util.ArrayList;
import java.util.List;

import br.unifacisa.si.treinamento.*;


public class AlunoService {
	
	private List<Aluno> dbAlunos = new ArrayList<Aluno>();
	private AlunoRepository repository;
	
	
	public void addAluno(Aluno alunoNovo) {
		boolean existe = false;
		for (Aluno aluno: dbAlunos) {
			if (aluno.getRegistro().equals(alunoNovo.getRegistro())){
				existe = true;
			}
		}
		if (existe == false) {
			repository.AdicionarAluno(alunoNovo);
		}
	}
	
	public void atualizaAluno(Aluno alunomodificado) 
	{	for(Aluno aluno: dbAlunos) 
		{	if(aluno.getID().equals(alunomodificado.getID())) 
			{	repository.AtualizaAluno(alunomodificado);
			}
		}
	}
	
	public void deletaAluno(Aluno alunoremover) 
	{
		for(Aluno aluno:dbAlunos) {
			if (aluno.getID().equals(alunoremover.getID())) {
				repository.DeletaAluno(alunoremover);
			}
		}
	}
	
}
