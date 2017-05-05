package it.cocacola.championshiprace.facades;

import java.util.List;

import it.cocacola.championshiprace.data.RaceChampionshipData;


public interface RaceChampionshipFacade
{
	RaceChampionshipData getRaceChampionship(String name);

	List<RaceChampionshipData> getRaceChampionships();

}
