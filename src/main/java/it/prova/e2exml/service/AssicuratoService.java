package it.prova.e2exml.service;

import java.util.List;

import it.prova.e2exml.model.Assicurato;

public interface AssicuratoService{
	public List<Assicurato> listAllElements();

	public Assicurato caricaSingoloElemento(Long id);

	public void aggiorna(Assicurato entityInstance);

	public void inserisciNuovo(Assicurato entityInstance);

	public void rimuoviById(Long idToRemove);

}
