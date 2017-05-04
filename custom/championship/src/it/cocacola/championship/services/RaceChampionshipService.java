package it.cocacola.championship.services;

import java.util.List;

import it.cocacola.championship.model.RaceChampionshipModel;


public interface RaceChampionshipService
{

	List<RaceChampionshipModel> getRaceChampionships();

	RaceChampionshipModel getRaceChampionshipsForCode(String code);

}