package it.cocacola.championship.services;


import it.cocacola.championship.model.DriverModel;
import it.cocacola.championship.model.VehicleModel;


public interface DriverService
{

	DriverModel getDriversForCode(String code);

	DriverModel getDriversForVehicle(VehicleModel vehicle);

}
