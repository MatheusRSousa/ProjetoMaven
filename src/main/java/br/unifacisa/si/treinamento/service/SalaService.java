package br.unifacisa.si.treinamento.service;

import java.util.ArrayList;
import java.util.List;

import br.unifacisa.si.treinamento.Sala;
import br.unifacisa.si.treinamento.repository.SalaRepository;

public class SalaService {

	private List<Sala> dbSalas = new ArrayList<Sala>();
	private SalaRepository repository;
	
	public void addSala(Sala salanova){
		boolean existe = false;
		for (Sala sala: dbSalas) {
			if (sala.getNumero().equals(sala.getNumero())){
				existe = true;
			}
		}
		if (existe == false) {
			repository.addSala(salanova);
		}
	}
	
	public void atualizaSala(Sala salamodificada) {
		for(Sala sala:dbSalas) {
			if(sala.getNumero().equals(salamodificada.getNumero())) {
				repository.atualizaSala(salamodificada);
			}
		}
		
	}
	
	public void deletaSala(Sala removeSala) {
		for(Sala sala:dbSalas) {
			if(sala.getNumero().equals(removeSala.getNumero())) {
				repository.DeletaSala(removeSala);
			}
		}
	}
}
