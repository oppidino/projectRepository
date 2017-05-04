package it.cocacola.championship.services;

import java.util.List;

import it.cocacola.championship.model.DriverModel;


public interface DriverService
{

	List<DriverModel> getVehicles();

	DriverModel getVehiclesForCode(String code);

}
