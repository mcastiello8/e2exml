package it.prova.e2exml.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.e2exml.model.Assicurato;
import it.prova.e2exml.repository.AssicuratoRepositpory;
@Service
public class AssicuratoServiceImpl implements AssicuratoService {
	@Autowired
	private AssicuratoRepositpory repository;
	@Override
	public List<Assicurato> listAllElements() {
		return (List<Assicurato>) repository.findAll();

	}

	@Override
	public Assicurato caricaSingoloElemento(Long id) {
		return repository.findById(id).orElse(null);

	}

	@Override
	public void aggiorna(Assicurato entityInstance) {
		repository.save(entityInstance);		
		
	}

	@Override
	public void inserisciNuovo(Assicurato entityInstance) {
		entityInstance.setDataDiNascita(LocalDate.of(1999, 10, 12));
		repository.save(entityInstance);		
	}

	@Override
	public void rimuoviById(Long idToRemove) {
		repository.deleteById(idToRemove);
		
	}
	

}
