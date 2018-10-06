package br.unifacisa.si.treinamento.repository;

import java.util.ArrayList;
import java.util.List;

import br.unifacisa.si.treinamento.*;;

public class SalaRepository {
	
	private List<Sala> dbSalas = new ArrayList<Sala>();
	private Integer sequenciaSalas = 0;
	
	public void addSala(Sala salanova) 
	{	salanova.setNumero(this.sequenciaSalas);
		dbSalas.add(salanova);
	}
	
	public void DeletaSala(Sala sala) 
	{	dbSalas.remove(sala);
	}
	
	public void atualizaSala(Sala salaModificada) 
	{ 	for(Sala sala: dbSalas) 
		{	if(sala.getID().equals(salaModificada.getID())) 
			{	
			}
		}
	}
	
	
}
