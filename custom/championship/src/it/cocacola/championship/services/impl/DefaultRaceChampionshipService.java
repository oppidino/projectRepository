package it.cocacola.championship.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.cocacola.championship.daos.RaceChampionshipDAO;
import it.cocacola.championship.model.RaceChampionshipModel;
import it.cocacola.championship.services.RaceChampionshipService;


public class DefaultRaceChampionshipService implements RaceChampionshipService
{
	private RaceChampionshipDAO raceChampionshipDAO;


	@Override
	public List<RaceChampionshipModel> getRaceChampionships()
	{
		return raceChampionshipDAO.findRaceChampionships();
	}

	@Override
	public RaceChampionshipModel getRaceChampionshipsForCode(final String code)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<RaceChampionshipModel> result = raceChampionshipDAO.findRaceChampionshipsByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Race Championship with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Race Championship code '" + code + "' is not unique, " + result.size() + " Race Championships found!");
		}
		return result.get(0);
	}

	@Required
	public void setRaceChampionshipDAO(final RaceChampionshipDAO raceChampionshipDAO)
	{
		this.raceChampionshipDAO = raceChampionshipDAO;
	}
}