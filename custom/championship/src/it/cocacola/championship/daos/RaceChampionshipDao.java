package it.cocacola.championship.daos;

import java.util.Date;
import java.util.List;

import it.cocacola.championship.model.RaceChampionshipModel;


public interface RaceChampionshipDao
{
	List<RaceChampionshipModel> findRaceChampionships();

	List<RaceChampionshipModel> findRaceChampionshipsByCode(String code);

	List<Date> retrieveGranPrixCalendar(String code);
}
