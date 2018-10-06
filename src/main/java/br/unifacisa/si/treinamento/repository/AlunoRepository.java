package br.unifacisa.si.treinamento.repository;

import br.unifacisa.si.treinamento.*;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
	
	private List<Aluno> dbAlunos = new ArrayList<Aluno>();
	private Long sequenciaAlunos = 0L;

	public Aluno AdicionarAluno(Aluno aluno) //CREAT
	{	aluno.setID(this.sequenciaAlunos);
		dbAlunos.add(aluno);
		setSequenciaAlunos();
		return aluno;
	}
	
	public Aluno AtualizaAluno(Aluno alunoModificado) //UPDATE
	{	for (Aluno aluno:dbAlunos) 
		{	if (aluno.getID().equals(alunoModificado.getID())) 
			{	aluno.setCurso(alunoModificado.getCurso());
				aluno.setNome(alunoModificado.getNome());
				break;
			}
		
		}	
	return alunoModificado;
	}
	
	public Aluno DeletaAluno(Aluno aluno) //DELETE
	{	dbAlunos.remove(aluno);
		return aluno;
	}
	
	public void setSequenciaAlunos() 
	{	sequenciaAlunos++;
	}
	

}
