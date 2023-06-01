package it.prova.e2exml.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import it.prova.e2exml.model.Assicurato;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class AssicuratoDTO {
	private Long id;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String codiceFiscale;
	private Integer numeroSinistri;
	public Assicurato buildAccountModel() {
		Assicurato result = new Assicurato(this.id, this.nome, this.cognome, this.dataDiNascita, this.codiceFiscale, this.numeroSinistri);
		return result;
	}

	public static AssicuratoDTO buildAssicuratoDTOFromModel(Assicurato model) {
		AssicuratoDTO result = AssicuratoDTO.builder().id(model.getId()).nome(model.getNome())
				.cognome(model.getCognome()).dataDiNascita(model.getDataDiNascita()).codiceFiscale(model.getCodiceFiscale()).numeroSinistri(model.getNumeroSinistri()).build();
		return result;
	}

	public static List<AssicuratoDTO> createAssicuratoDTOListFromModelList(List<Assicurato> modelList) {
		return modelList.stream().map(entity -> AssicuratoDTO.buildAssicuratoDTOFromModel(entity))
				.collect(Collectors.toList());
	}

	public static Page<AssicuratoDTO> fromModelPageToDTOPage(Page<Assicurato> input) {
		return new PageImpl<>(createAssicuratoDTOListFromModelList(input.getContent()),
				PageRequest.of(input.getPageable().getPageNumber(), input.getPageable().getPageSize(),
						input.getPageable().getSort()),
				input.getTotalElements());
	}
	

}
