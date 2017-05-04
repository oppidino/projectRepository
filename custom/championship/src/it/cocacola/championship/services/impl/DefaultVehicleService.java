package it.cocacola.championship.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.cocacola.championship.daos.VehicleDAO;
import it.cocacola.championship.model.VehicleModel;
import it.cocacola.championship.services.VehicleService;


public class DefaultVehicleService implements VehicleService
{
	private VehicleDAO vehicleDAO;

	@Override
	public List<VehicleModel> getVehicles()
	{
		return vehicleDAO.findVehicles();
	}

	@Override
	public VehicleModel getVehiclesForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<VehicleModel> result = vehicleDAO.findVehiclesByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Stadium with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Stadium code '" + code + "' is not unique, " + result.size() + " stadiums found!");
		}
		return result.get(0);
	}

	@Required
	public void setVehicleDAO(final VehicleDAO vehicleDAO)
	{
		this.vehicleDAO = vehicleDAO;
	}
}