package it.cocacola.championship.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.cocacola.championship.daos.DriverDAO;
import it.cocacola.championship.model.DriverModel;
import it.cocacola.championship.services.DriverService;


public class DefaultDriverService implements DriverService
{
	private DriverDAO driverDAO;

	@Override
	public DriverModel getDriversForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<DriverModel> result = driverDAO.findDriversByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Driver with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Driver code '" + code + "' is not unique, " + result.size() + " drivers found!");
		}
		return result.get(0);
	}

	@Required
	public void setDriverDAO(final DriverDAO driverDAO)
	{
		this.driverDAO = driverDAO;
	}
}