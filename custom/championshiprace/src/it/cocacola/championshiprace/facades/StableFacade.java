package it.cocacola.championshiprace.facades;

import it.cocacola.championshiprace.data.StableData;
import it.cocacola.championshiprace.data.VehicleData;


public interface StableFacade
{
	StableData getStable(String name);

	StableData getStable(VehicleData vehicle);
}
