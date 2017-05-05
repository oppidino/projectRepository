package it.cocacola.championshiprace.facades;

import it.cocacola.championshiprace.data.DriverData;
import it.cocacola.championshiprace.data.VehicleData;


public interface DriverFacade
{

	DriverData getDriver(String name);

	DriverData getDriver(VehicleData vehicle);

}
