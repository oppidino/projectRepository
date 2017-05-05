package it.cocacola.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.cocacola.championship.model.VehicleModel;
import it.cocacola.championshiprace.data.VehicleData;


public class DefaultVehiclePopulator implements Populator<VehicleModel, VehicleData>
{

	@Override
	public void populate(final VehicleModel source, final VehicleData target) throws ConversionException
	{
		target.setName(source.getName());
		target.setNumber(source.getNumber());
		target.setType(source.getType().toString());
	}

}
