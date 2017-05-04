package it.cocacola.championship.daos;

import java.util.List;

import it.cocacola.championship.model.RaceChampionshipModel;


public interface RaceChampionshipDAO
{
	List<RaceChampionshipModel> findRaceChampionships();

	List<RaceChampionshipModel> findRaceChampionshipsByCode(String code);

}
